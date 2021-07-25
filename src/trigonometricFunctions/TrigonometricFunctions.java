// This class consists the operations of various trigonometric functions - SIN, COS, TAN. 


package trigonometricFunctions;

public class TrigonometricFunctions {
	
	public static final double pi = 3.141592;			
	public static final double angleOfCircle = 360;	
	
	
	/**
	   * This function converts the degree to radian.
	   * @param double x: Degree value to be converted into radian.
	   * @return double: Radian value.
	 */
	public static double degreeToRadian (double x) {
		
		return (2 * x * pi) / angleOfCircle;
	}
	

	/**
	   * This function calculates a radian value.
	   * @param double x: Value to be converted into radian.
	   * @return double Radian value.
	 */
	public static double radian (double x){
		
		return x % (pi*2);
	}
	
	
	/**
	   * This function calculates a sine of an angle.
	   * @param double angle: Calculate the sine of this angle.
	   * @return double: sine value.
	   * @exception powerException, FactorialException
	 */
	public static double sin(double angle) throws PowerException, FactorialException
	{
		double sin = 0;
		double normalAgg = radian(angle);
		
		for(int z=1;z<=11;z++)
		{
			sin = sin + (power(-1, z-1)*
					power(normalAgg, (2*z)-1)/factorial((2*z)-1));
		}
		
		return sin;
	}

	
	/**
	   * This function calculates a cosine of an angle.
	   * @param double angle: Calculate the cosine of this angle.
	   * @return double: cosine value.
	   * @exception powerException, FactorialException
	 */
	public static double cos(double angle) throws PowerException, FactorialException
	{
		double cos = 0;
		double normalAgg = radian(angle);
		
		for(int z=1;z<=11;z++)
		{
			cos = cos + (power(-1, z-1) * 
					power(normalAgg, 2*(z-1))/factorial(2*(z-1)));
		}
	
		return cos;
	}

	
	/**
	   * This function calculates a tan of an angle.
	   * @param double angle: Calculate the tan of this angle.
	   * @return double: tan value.
	   * @exception powerException, FactorialException
	 */
	public static double tan(double angle) throws PowerException, FactorialException
	{
		double tan = 0;
		
		tan = sin(angle) / cos(angle);
		
		return tan;
	}
	
	
	
	/**
	   * This function calculates the power of a value.
	   * @param double x: value whose power is to be calculated.
	   * @param double y: raise to value.
	   * @return double: power x^y
	   * @exception powerException Catch the exceptions of invalid inputs.
	 */
	public static double power(double x, double y) throws PowerException {
		
		double value = 1;
		
		if( y == 0) {
			
			return value;
		}
		
		if( y < 0 ) {
			
			throw new PowerException("Can not Compute for Negative power!");
			
		}
		
		for(int i = 1; i <= y; i++) {
			
			value = value * x;
		}
		
		return value;
	}

	/**
	   * This function calculates the power of a value.
	   * @param int x value whose power is to be calculated.
	   * @return long factorial x!.
	   * @exception FactorialException Catch the exceptions of invalid inputs.
	 */
	public static long factorial(int x) throws FactorialException {
		
		long fact = 1;
		
		if(x >= 0) {
			
			for(int i = 1; i <= x; i++) {
					
				fact = fact * i;
			}
		}
		
		else {
			throw new FactorialException("Inavlid number to calculate the factorial");
		}
		
		return fact;
	}

}
