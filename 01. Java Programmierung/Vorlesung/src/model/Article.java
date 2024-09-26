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

    // Überladener Konstruktor ohne Lagerbestandsparameter
    public Article(int id, String name, int price) {
        this(id, name, 0, price); // Initialisiert den Lagerbestand mit 0
    }

    // Getter & Setter
    public int getId() {
        return this.id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }
}
