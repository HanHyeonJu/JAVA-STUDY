package custom_exception.exceptions;

public class TempTooRowException extends TempOutOfRangeException{
	private static final long serialVersionUID = 1L;
	
	public TempTooRowException(String message) {
		super(message);
	}



}
