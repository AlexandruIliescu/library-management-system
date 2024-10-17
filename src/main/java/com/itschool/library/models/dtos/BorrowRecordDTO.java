package com.itschool.library.models.dtos;

import lombok.Data;

@Data
public class BorrowRecordDTO {

    private Long customerId;
    private Long bookId;
}