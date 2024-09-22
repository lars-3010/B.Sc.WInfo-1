package model;

public class LecturerCollection {

	private Lecturer[] lecturers = new Lecturer[100];
	
	public String toString() {
		String result = "Currently available Lecturers are:";
		for (Lecturer lecturer : lecturers) {
			if (lecturer != null) {
				result += "\n - " + lecturer.toString();
			}
		}
		return result;
	}
	
	
	public boolean add(Lecturer lecturer) {
		if (lecturer != null) {
			int index = getNextFreeIndex();
			if (index >=0) {
				lecturers[index] = lecturer;
				return true;
			}
		}
		return false;
	}
	
	private int getNextFreeIndex() {
		for (int index = 0; index <lecturers.length; index++) {
			if (lecturers[index] == null) {
				return index;
			}
		}
	    return -1;
	}
	
	public boolean delete(Lecturer lecturer) {
		if (lecturer != null) {
			int index = findLecturer(lecturer);
			lecturers[index] = null;
			return true;
		} 
		return false;
	}
	
	public boolean delete(String name) {
		if (name != null) {
			int index = findLecturer(name);
			lecturers[index] = null;
			return true;
		} 
		return false;
	}
	
	
	private int findLecturer(Lecturer lecturer) {
		for (int index = 0; index < lecturers.length; index++) {
			if (lecturers[index] == lecturer) {
				return index;
			}
		}
	    return -1;
	}
	
	private int findLecturer(String name) {
		for (int index = 0; index < lecturers.length; index++) {
			if (lecturers[index] != null && lecturers[index].getName() == name) {
				return index;
			}
		}
	    return -1;
	}

}