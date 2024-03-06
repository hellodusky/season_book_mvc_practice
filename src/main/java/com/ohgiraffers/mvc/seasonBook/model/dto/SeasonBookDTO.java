package com.ohgiraffers.mvc.seasonBook.model.dto;

public class SeasonBookDTO {

    private String bookCode;
    private int seasonCode;
    private String bookName;
    private String author;
    private String bookCategory;

    public SeasonBookDTO() {
    }

    public SeasonBookDTO(String bookCode, int seasonCode, String bookName, String author, String bookCategory) {
        this.bookCode = bookCode;
        this.seasonCode = seasonCode;
        this.bookName = bookName;
        this.author = author;
        this.bookCategory = bookCategory;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public int getSeasonCode() {
        return seasonCode;
    }

    public void setSeasonCode(int seasonCode) {
        this.seasonCode = seasonCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    @Override
    public String toString() {
        return "SeasonBookDTO{" +
                "bookCode='" + bookCode + '\'' +
                ", seasonCode='" + seasonCode + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", bookCategory='" + bookCategory + '\'' +
                '}';
    }
}
