package com.kodilla.rest.domain;

import java.util.Objects;
import java.util.UUID;

public class BookDto {
    private String title;
    private String author;
    private UUID id;

    public BookDto(){
    }

    public BookDto(String title, String author, UUID id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public BookDto(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookDto)) return false;
        BookDto bookDto = (BookDto) o;
        return Objects.equals(title, bookDto.title) && Objects.equals(author, bookDto.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
