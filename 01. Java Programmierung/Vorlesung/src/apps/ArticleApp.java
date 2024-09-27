package apps;
import model.Article;
import model.StorageLocation;

public class ArticleApp {
    public static void main(String[] args) {

        /* 
        Article banana = new Article(01, "Banana", 50, 1);
        System.out.println(banana);

        // Nutzung des überladenen Konstruktors ohne Lagerbestandsparameter
        Article apple = new Article(2, "Apple", 2);
        System.out.println(apple);

        // Nutzung des Konstruktors mit allen Parametern
        Article orange = new Article(3, "Orange", 30, 3);
        System.out.println(orange);

        // Nutzung des überladenen Konstruktors ohne Lagerbestandsparameter
        Article grape = new Article(4, "Grape", 4);
        System.out.println(grape);
        */

        StorageLocation location1 = new StorageLocation("Lager A", 1);
        StorageLocation location2 = new StorageLocation("Lager B", 2);

        Article article1 = new Article("Artikel1", 10, 5, location1);
        Article article2 = new Article("Artikel2", 20, location2);
        Article article3 = new Article("Artikel3", 15, 10, location1);

        System.out.println(article1);
        System.out.println(article2);
        System.out.println(article3);

        article1.addToStock(5);
        System.out.println("Bestand nach Hinzufügen: " + article1.getStock());
        System.out.println("Bestandwert nach Hinzufügen: " + article1.getInventoryValue());

        article1.takeFromStock(3);
        System.out.println("Bestand nach Entnahme: " + article1.getStock());
        System.out.println("Bestandwert nach Entnahme: " + article1.getInventoryValue());

        article1.takeFromStock(20); // Test für nicht genügend Bestand
    }
}
