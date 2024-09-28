import information.Instrument;
import information.Voice;

public class MusicianApp {

    public static void main(String[] args) {
        Person lars = new Person("Lars", 2003);
        Ageable moritz = new Instrumentalist ("Moritz", 1980, Instrument.WOODWIND);
        Musician frida = new Singer("Frida", 1989, Voice.SOPRANO);

        System.out.println(lars);
        System.out.println(moritz);
        System.out.println(frida);
        System.out.println("Moritz Alter: " + moritz.getAge() + " Fridas Alter: " + frida.getAge());
        //System.out.println(frida.isSoloist()?"Frida ist eine Solistin":"Frida ist keine Solistin");
        if (frida.isSoloist() == true) {
            System.out.println("Frida ist eine Solistin");
        }
        else
        {
            System.out.println("Frida ist keine Solistin");
        };
    }
}