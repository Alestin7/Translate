package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Book {
    private String name;
    private String author;
    private int year;
    private String manufacturer;
    private int price;
     String state;
    private LocalDateTime date;

    public Book(String name, String author, int year, String manufacturer, int price, String state, LocalDateTime date) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.manufacturer = manufacturer;
        this.price = price;
        this.state = state;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public static Book generate(){
        Random r = new Random();
        return new Book(Dictionary.getNames()[r.nextInt(Dictionary.getNames().length)],
                Dictionary.getAuthors()[r.nextInt(Dictionary.getAuthors().length)],
                r.nextInt(21)+2000,
                Dictionary.getManufacturers()[r.nextInt(Dictionary.getManufacturers().length)],
                r.nextInt(2000) +1000,
                Dictionary.getStates()[r.nextInt(Dictionary.getStates().length)],
                LocalDateTime.of(r.nextInt(21)+2000, r.nextInt(12)+1, r.nextInt(28)+1,0,0));
    }

    @Override
    public String toString() {
        return "\n\n\nКнига{" +
                "\nname='" + name + '\'' +
                ", \nauthor='" + author + '\'' +
                ", \nyear=" + year +
                ", \nmanufacturer='" + manufacturer + '\'' +
                ", \nprice=" + price +
                ", \nstate='" + state + '\'' +
                ", \ndate=" + date.format(DateTimeFormatter.ofPattern("d.M.y")) +
                '}';
    }
}
