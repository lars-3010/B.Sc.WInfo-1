package model;
public class Location {
    private String street;
    private int zip;
    private String town;

    public Location(String sreet, int zip, String town) {
        this.street = street;
        this.zip = zip;
        this.town = town;
    }

    public String getStreet() {
        return street;
    }
    public int getZip() {
        return zip;
    }
    public String getTown() {
        return town;
    } 

    public String toString() {
        return "Location [street=" + street + ", zip=" + zip + ", town=" + town + "]";
    }
}