package utilities;
public class IdFactory {
    
    public static final int FIRST_ID = 10001;
    public static final int LAST_ID = 99999;
    private static int nextId = LAST_ID;
    
    public static int getNextId(){
        if (nextId <= LAST_ID) {
            return nextId++;
        } 
        else {
            return 0;
        }
    }
    
    static int getNoOfAvailableIds() {
        return LAST_ID-nextId+1;
    }

    static int getNoOfAssignedIds() {
        return nextId-FIRST_ID;
    }
}