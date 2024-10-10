package com.itschool.library.services;

import com.itschool.library.models.entities.Book;
import org.springframework.data.jpa.domain.Specification;

public class BookSpecification {

    //title, author, genre
    public static Specification<Book> titleContains(String title) {
        return (book, query, criteriaBuilder) -> title == null ? null :
                criteriaBuilder.like(criteriaBuilder.lower(book.get("title")), "%" + title.toLowerCase() + "%");
    }

    public static Specification<Book> authorContains(String author) {
        return (book, query, criteriaBuilder) -> author == null ? null :
                criteriaBuilder.like(criteriaBuilder.lower(book.get("author")), "%" + author.toLowerCase() + "%");
    }

    public static Specification<Book> genreContains(String genre) {
        return (book, query, criteriaBuilder) -> genre == null ? null :
                criteriaBuilder.like(criteriaBuilder.lower(book.get("genre")), "%" + genre.toLowerCase() + "%");
    }
}