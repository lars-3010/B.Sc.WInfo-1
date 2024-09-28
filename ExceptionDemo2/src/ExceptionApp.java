import model.*;

public class ExceptionApp {
    public static void main(String[] args) throws Exception {
        
        int a = 25;
        int b = 0;
        int c;
        int rest;
        if (b==0){
            throw new DivisionByZeroSelfmade();
        } else {
            c = a/b;
            rest = a-c*b;}
            System.out.println("Ergebnis; " + a + ":" + b + " = " + c +", Rest " + rest);
        }
    }
