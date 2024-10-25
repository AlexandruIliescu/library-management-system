package com.itschool.library.controllers;

import com.itschool.library.models.dtos.RequestCustomerDTO;
import com.itschool.library.models.dtos.ResponseCustomerDTO;
import com.itschool.library.services.ChatGPTService;
import com.itschool.library.services.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/api/customers")
@RestController
public class CustomerController {

    private final CustomerService customerService;
    private final ChatGPTService chatGPTService;

    public CustomerController(CustomerService customerService, ChatGPTService chatGPTService) {
        this.customerService = customerService;
        this.chatGPTService = chatGPTService;
    }

    @Operation(summary = "Create a new customer")
    @PostMapping
    public ResponseEntity<ResponseCustomerDTO> createCustomer(
            @Valid
            @RequestBody
            RequestCustomerDTO requestCustomerDTO) {
        return ResponseEntity.ok(customerService.createCustomer(requestCustomerDTO));
    }

    @Operation(summary = "Delete a customer by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomerById(@PathVariable Long id) {
        customerService.deleteCustomerById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/chat")
    public ResponseEntity<String> chatWithGPT(@RequestBody Map<String, String> request) {
        String userMessage = request.get("message");
        String response = chatGPTService.getChatResponse(userMessage);
        return ResponseEntity.ok(response);
    }
}