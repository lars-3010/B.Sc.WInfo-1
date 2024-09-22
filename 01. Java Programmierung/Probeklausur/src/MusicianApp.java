
import information.Instrument;
import information.Voice;

public class MusicianApp {

    public static void main(String[] args) {
        // Person marisa = new Person("Marisa", 2000);
        Ageable marisa = new Instrumentalist("Marisa", 2008, Instrument.WOODWIND);
        Musician frida = new Singer("Frida", 1989, Voice.SOPRANO);

        System.out.println(marisa);
        System.out.println(frida);

        System.out.println(marisa.getAge() + " & " + frida.getAge());
        System.out.println(frida.isSoloist());
    }
}