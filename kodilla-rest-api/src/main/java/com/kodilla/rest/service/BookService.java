package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BookService {

    private List<BookDto> books = new ArrayList<>();

    public List<BookDto> getBooks() {
        return books;
    }

    public void addBook(BookDto bookDto) {
   bookDto.setId(UUID.randomUUID());
        books.add(bookDto);
    }

    public void removeBook(BookDto bookDto) {
        books.remove(bookDto);
    }

}