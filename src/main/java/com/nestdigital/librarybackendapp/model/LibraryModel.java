package com.nestdigital.librarybackendapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "library")
public class LibraryModel {
    @Id
    @GeneratedValue
    private int id;
    private String bookname;
    private String authorname;
    private String description;

    public LibraryModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LibraryModel(int id, String bookname, String authorname, String description) {
        this.id = id;
        this.bookname = bookname;
        this.authorname = authorname;
        this.description = description;
    }
}
