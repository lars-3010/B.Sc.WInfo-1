package model;

public final class Square extends Rectangle {

 public Square(double length) {
	 super(length, length);
 }
 
 public double getLength() {
	 return super.getLength();
 }
 
 public String toString() {
	 return "Square(" + this.getLength() + ")";
 }
}