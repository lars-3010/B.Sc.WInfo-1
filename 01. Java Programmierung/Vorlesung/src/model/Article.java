package model;

public class Article {
    private int id;
    private String name;
    private int stock;
    private int price;
    public static final int LAST_ID = 99999;
    public static final int FIRST_ID = 10001;
    //private static int nextId = FIRST_ID;

    // Konstruktor
    public Article() {
    }

    public Article(int id, String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        if (id>FIRST_ID && id<LAST_ID) {
            this.id = id;
        }
        else {
            this.id = 0;
        }
    }

    // Überladener Konstruktor ohne Lagerbestandsparameter
    public Article(int id, String name, int price) {
        this(id, name, 0, price); // Initialisiert den Lagerbestand mit 0
        if (id>FIRST_ID && id<LAST_ID) {
            this.id = id;
        }
        else {
            this.id = 0;
        }
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

    public void addToStock(int amount) {
        this.stock += amount;
    }
    public void takeFromStock(int amount) {
        if (this.stock >= amount) {
            this.stock -= amount;
        }
        else {
            System.out.println("Nicht genügend Bestand vorhanden");
        }
    }
    public double getInventoryValue() {
        return this.stock * this.price;
    }
}
