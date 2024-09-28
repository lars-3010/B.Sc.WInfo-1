
import information.Instrument;
import information.Voice;

public class MusicianApp {

    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 2, 3, 5};
        for(int entries : array1){
            System.out.println(entries);
        }
        
        // Person marisa = new Person("Marisa", 2000);
        Ageable marisa = new Instrumentalist("Marisa", 2008, Instrument.WOODWIND);
        Musician frida = new Singer("Frida", 1989, Voice.SOPRANO);

        System.out.println(marisa);
        System.out.println(frida);

        System.out.println(marisa.getAge() + " & " + frida.getAge());
        System.out.println(frida.isSoloist());
    }
}