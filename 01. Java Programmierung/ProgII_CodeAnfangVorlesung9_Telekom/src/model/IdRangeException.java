package model;

public class IdRangeException extends Exception{
    public IdRangeException() {
        super("Diese ID geht nicht");
    }

	public IdRangeException(String errorDescription) {
		super(errorDescription);
	}
}
