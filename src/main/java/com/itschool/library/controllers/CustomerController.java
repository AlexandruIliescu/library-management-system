package com.itschool.library.controllers;

import com.itschool.library.models.dtos.RequestCustomerDTO;
import com.itschool.library.models.dtos.ResponseCustomerDTO;
import com.itschool.library.services.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/customers")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Operation(summary = "Create a new customer")
    @PostMapping
    public ResponseEntity<ResponseCustomerDTO> createCustomer(
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
}