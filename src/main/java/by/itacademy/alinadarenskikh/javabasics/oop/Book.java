package by.itacademy.alinadarenskikh.javabasics.oop;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;

    private int publicationYear;
    private int numOfPages;
    private double price;

    public Book(){

    }

    public Book(int id, String name, String author, String publisher, int publicationYear, int numOfPages, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.numOfPages = numOfPages;
        this.price = price;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPages() {
        return numOfPages;
    }

    public void setPages(int pages) {
        this.numOfPages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", \nname='" + name + '\'' +
                ", \nauthor='" + author + '\'' +
                ", \npublisher='" + publisher + '\'' +
                ", \npublicationYear=" + publicationYear +
                ", \nnumOfPages=" + numOfPages +
                ", \nprice=" + price +
                '}';
    }
}
