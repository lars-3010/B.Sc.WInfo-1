package model;

public class Article {
    private int id;
    private String name;
    private int stock;
    private int price;

    // Konstruktor
    public Article(int id, String name, int stock, int price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    // Getter & Setter
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getInStock() {
        return this.stock;
    }
    public void setInStock(int stock) {
        this.stock = stock;
    }
    public int getSalesPrice() {
        return this.price;
    }
    public void setSalesPrice(int price) {
        this.price = price;
    }
    public String toString() {
        return "Name: " + name + " ID: " + id + " Stock: " + stock + " Price: " + price;
    }
}

/*
Neue Klasse namens Article anlegen und Implementierung der
links im Klassendiagramm genannten Methoden (Getter/Setter)
▪ Neue Klasse namens ArticleApp mit einer „main-Methode“
anlegen, Anlegen von zwei Beispielartikeln und Anzeige des
jeweiligen Datensatzes über System.out.println
 */