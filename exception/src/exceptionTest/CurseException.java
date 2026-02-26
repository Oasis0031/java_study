package exceptionTest;

public class CurseException extends RuntimeException {

	public CurseException() {;}
	public CurseException(String message) {
		super(message);
	}
	
}
