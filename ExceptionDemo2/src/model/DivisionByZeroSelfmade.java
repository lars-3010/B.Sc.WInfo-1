package model;

public class DivisionByZeroSelfmade extends Exception {
    
    public DivisionByZeroSelfmade(){
        super("Bist du dumm? Hast du nicht Aufgepasst? Null? Teilen?");
    }

    public DivisionByZeroSelfmade(String errorDescription){
        super(errorDescription);
    }
}
