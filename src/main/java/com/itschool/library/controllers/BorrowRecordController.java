package com.itschool.library.controllers;

import com.itschool.library.models.dtos.BorrowRecordDTO;
import com.itschool.library.models.dtos.ResponseBookDTO;
import com.itschool.library.services.BorrowRecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BorrowRecordController {

    private final BorrowRecordService borrowRecordService;

    public BorrowRecordController(BorrowRecordService borrowRecordService) {
        this.borrowRecordService = borrowRecordService;
    }

    @PostMapping("/api/borrow")
    public ResponseEntity<ResponseBookDTO> borrowBook(@RequestBody BorrowRecordDTO borrowRecordDTO) {
        borrowRecordService.borrowBook(borrowRecordDTO);
        return ResponseEntity.noContent().build();
    }
}