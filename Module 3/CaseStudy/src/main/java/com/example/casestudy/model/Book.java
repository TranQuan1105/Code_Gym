package com.example.casestudy.model;

public class Book {
    private String title;
    private String author;
    private String category;
    private int copiesAmount;
    private int availableCopies;

    public Book(String title, String author, String category, int copiesAmount, int availableCopies) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.copiesAmount = copiesAmount;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCopiesAmount() {
        return copiesAmount;
    }

    public void setCopiesAmount(int copiesAmount) {
        this.copiesAmount = copiesAmount;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }
}
