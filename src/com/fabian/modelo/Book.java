/*1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabian.modelo;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Book {
     private int id;
    private String title;
    private Date editionDate;
    private String editorial;
    private String authors[];
    private String isbn;
    private boolean readed;
    private int timeReader;

    public Book() {
    }

    public Book(int id, String title, Date editionDate, String editorial, String[] authors, String isbn, boolean readed, int timeReader) {
        this.id = id;
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.authors = authors;
        this.isbn = isbn;
        this.readed = readed;
        this.timeReader = timeReader;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the editionDate
     */
    public Date getEditionDate() {
        return editionDate;
    }

    /**
     * @param editionDate the editionDate to set
     */
    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the authors
     */
    public String[] getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the readed
     */
    public boolean isReaded() {
        return readed;
    }

    /**
     * @param readed the readed to set
     */
    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    /**
     * @return the timeReader
     */
    public int getTimeReader() {
        return timeReader;
    }

    /**
     * @param timeReader the timeReader to set
     */
    public void setTimeReader(int timeReader) {
        this.timeReader = timeReader;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
