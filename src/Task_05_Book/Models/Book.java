package Task_05_Book.Models;

import java.time.LocalDate;
import java.util.Arrays;

public class Book {
    int id;
    String name;
    String[] authors;
    String publisher;
    LocalDate publishingYear;
    short countPages;
    int prices;
    String  binding;

    public Book(int id, String name, String[] authors, String publisher, LocalDate publishingYear, short countPages, int prices, String binding) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.countPages = countPages;
        this.prices = prices;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(LocalDate publishingYear) {
        this.publishingYear = publishingYear;
    }

    public short getCountPages() {
        return countPages;
    }

    public void setCountPages(short countPages) {
        this.countPages = countPages;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher='" + publisher + '\'' +
                ", publishingYear=" + publishingYear +
                ", countPages=" + countPages +
                ", prices=" + prices +
                ", binding='" + binding + '\'' +
                '}';
    }
}

