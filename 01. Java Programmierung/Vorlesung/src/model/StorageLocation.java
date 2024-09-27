package model;

public class StorageLocation {
    private String name;
    private int locationNo;

    // Konstruktor
    public StorageLocation(String name, int locationNo) {
        this.name = name;
        this.locationNo = locationNo;
    }

    public String getName() {
        return this.name;
    }
    public int getLocationNo() {
        return this.locationNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLocationNo(int locationNo) {
        this.locationNo = locationNo;
    }

    @Override
    public String toString() {
        return "StorageLocation{" +
                "name='" + name + '\'' +
                ", locationNo=" + locationNo +
                '}';
    }
}
