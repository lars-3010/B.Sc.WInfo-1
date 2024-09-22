package model;

public class IdFactory {
			
	public static final int FIRST_ID = 99998;
	public static final int LAST_ID = 99999;
	private static int nextId = FIRST_ID;
	
	//static methods
	public static int getNextId() throws IdRangeException {
		if (nextId <= LAST_ID) {
			return nextId++;
		} else {
			throw new IdRangeException("Id overflow");
		}
	}
	
	public static int getNoOfAvailableIds() {
		  return LAST_ID-nextId+1;	
	}
		
	public static int getNoOfAssignedIds() {
		  return nextId-FIRST_ID;	
	}
}
	