package model;

//Loesung der Hausübung 7.6
public class Staff extends Person{
	private Function function;
	
	public Staff(String name, Location placeOfBirth, Location residence, Function function) {
		super(name, placeOfBirth, residence);
		this.function=function;
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}
	
	public String toString() {
		return super.toString()
		+ ", works as " + this.function;
	}
	
	public String getTypeName() {
		return "Staff";
	}
}

