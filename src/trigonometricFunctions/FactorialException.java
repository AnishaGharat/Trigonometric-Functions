package trigonometricFunctions;

public class FactorialException extends Exception{
	
	/**
	   * This function raises an exception while calculating factorial.
	   * @param String message: Exception to be raised.
	 */
	public FactorialException(String message) {
		
		super(message);
	}

}
