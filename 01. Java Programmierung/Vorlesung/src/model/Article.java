package model;

public class Article{
    private int id;
    private String name;
    private int stock;
    private int price;
    private StorageLocation storageLocation;
    private static final int LAST_ID = 99999;
    private static final int FIRST_ID = 10001;
    private static int nextId = FIRST_ID;

    // Standardkonstruktor
    public Article() {
        this.id = generateNextId();
    }

    // Konstruktor mit Name, Stock, Price und StorageLocation
    public Article(String name, int stock, int price, StorageLocation storageLocation) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.storageLocation = storageLocation;
        this.id = generateNextId();
    }

    // Konstruktor mit Name, Price und StorageLocation
    public Article(String name, int price, StorageLocation storageLocation) {
        this.name = name;
        this.price = price;
        this.stock = 0;
        this.storageLocation = storageLocation;
        this.id = generateNextId();
    }

    // Getter und Setter
    public int getId() {
        return this.id;
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

    public StorageLocation getStorageLocation() {
        return this.storageLocation;
    }

    public void setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", storageLocation=" + storageLocation +
                '}';
    }

    public void addToStock(int amount) {
        this.stock += amount;
    }

    public void takeFromStock(int amount) {
        if (this.stock >= amount) {
            this.stock -= amount;
        } else {
            System.out.println("Nicht genügend Bestand vorhanden");
        }
    }

    public double getInventoryValue() {
        return this.stock * this.price;
    }

    private static int generateNextId() {
        if (nextId <= LAST_ID) {
            return nextId++;
        } else {
            throw new RuntimeException("Keine weiteren Artikelnummern verfügbar.");
        }
    }
}
