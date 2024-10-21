package com.itschool.library.controllers;

import com.itschool.library.models.dtos.CopiesAvailableDTO;
import com.itschool.library.models.dtos.RequestBookDTO;
import com.itschool.library.models.dtos.ResponseBookDTO;
import com.itschool.library.services.BookService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/books")
@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<ResponseBookDTO> createBook(@Valid @RequestBody RequestBookDTO requestBookDTO) {
        return ResponseEntity.ok(bookService.createBook(requestBookDTO));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseBookDTO> updateBookCopies(@PathVariable Long id, @RequestBody CopiesAvailableDTO copiesAvailable) {
        return ResponseEntity.ok(bookService.updateBookCopies(id, copiesAvailable.getCopiesAvailable()));
    }

    @Operation(summary = "Get all filtered books by title, author and genre")
    @GetMapping
    public ResponseEntity<List<ResponseBookDTO>> getBooks(
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "author", required = false) String author,
            @RequestParam(value = "genre", required = false) String genre) {
        return ResponseEntity.ok(bookService.getBooks(title, author, genre));
    }
}