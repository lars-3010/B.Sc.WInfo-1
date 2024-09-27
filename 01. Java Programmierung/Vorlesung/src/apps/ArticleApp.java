package apps;
import model.Article;

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

        Article article = new Article();
        article.setStock(10);
        article.setPrice(5);

        System.out.println("Anfangsbestand: " + article.getStock());
        System.out.println("Anfangsbestandwert: " + article.getInventoryValue());

        article.addToStock(5);
        System.out.println("Bestand nach Hinzufügen: " + article.getStock());
        System.out.println("Bestandwert nach Hinzufügen: " + article.getInventoryValue());

        article.takeFromStock(3);
        System.out.println("Bestand nach Entnahme: " + article.getStock());
        System.out.println("Bestandwert nach Entnahme: " + article.getInventoryValue());

        article.takeFromStock(20); // Test für nicht genügend Bestand
    }
}
