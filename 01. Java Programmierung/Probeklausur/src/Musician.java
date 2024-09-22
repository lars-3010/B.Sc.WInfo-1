public abstract class Musician extends Person{
    public Musician(String name, int yearOfBirth) {
        super(name, yearOfBirth);
    }

    public abstract boolean isSoloist();

    public String toString() {
        return super.toString();
    }
}

/*
Musiker sollen über eine abstrakte Objektklasse Musician erstellt werden, ++
welche Person erweitert und ebenfalls die üblichen Standardmethoden enthält. 
Zudem soll Musician eine Methode isSoloist() enthalten, 
die abfragt ob der Musiker ein Solosänger oder ein Solospieler ist oder nicht. 
(Hinweis: alle Sänger und Instrumentalisten sollen Soloisten sein, der Dirigent ist kein Soloist.)
 */