import model.*;

public class TripleApp {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        for ( int entries : array1){
            System.out.println(entries);
        }


        Triple<String> freundeoderso = new Triple("Lars", "Marisa", "Maybrit");
        System.out.println(freundeoderso);
        freundeoderso.shiftLeft();
        System.out.println(freundeoderso);
        
        Triple<Integer> noten = new Triple(1, 2, 3);
        System.out.println(noten);
        noten.shiftRight();
        System.out.println(noten);
        
        
    }
}
