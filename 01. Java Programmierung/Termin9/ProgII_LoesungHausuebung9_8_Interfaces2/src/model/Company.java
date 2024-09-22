package model;

public class Company implements Addressable {
	String name;
	Location location;
	int foundingYear;
	

	public Company(String name, Location location, int foundingYear) {
		this.name = name;
		this.location = location;
		this.foundingYear = foundingYear;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;		
	}

	@Override
	public Location getLocation() {
		return location;
	}

	@Override
	public void setLocation(Location location) {
		this.location = location;		
	}
	
}
