package com.itschool.library.models.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "borrow_records")
public class BorrowRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "borrowed_at")
    private LocalDateTime borrowedAt;
    @Column(name = "returned_at")
    private LocalDateTime returnedAt;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
}