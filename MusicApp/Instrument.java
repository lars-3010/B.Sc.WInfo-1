public enum Instrument {
    BRASS("Blech"), 
    KEYBOARD("Keyboard"), 
    PERCUSSION("Schlag"), 
    STRING("Streichinstrument"), 
    WOODWIND("Holz");

    private String germanName;
    private Instrument(String germanName){
        this.germanName = germanName;
    }

    public String getGermanName(){
        return germanName;
    }
    
    public String toString(){
        return germanName;
    }
}