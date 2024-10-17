package com.itschool.library.services;

import com.itschool.library.models.dtos.BorrowRecordDTO;

public interface BorrowRecordService {

    void borrowBook(BorrowRecordDTO borrowRecordDTO);
}
