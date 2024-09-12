package model;

public class StorageLocation {

	private String name;
	private int locationNo;
	
	public StorageLocation (String name, int locationNo) {
		this.name = name;
		this.locationNo = locationNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLocationNo() {
		return locationNo;
	}

	public void setLocationNo(int locationNo) {
		this.locationNo = locationNo;
	}

	public String toString() {
		return this.name + " (" + this.locationNo + ")"; 
	}
}
