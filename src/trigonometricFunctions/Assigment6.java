package trigonometricFunctions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class Assigment6 {

	double decimalpoints = 0.0001;
	
	@Test	
	public	void AccuracySin() throws PowerException, FactorialException
	{
		assertEquals(Math.sin(1), TrigonometricFunctions.sin(1), decimalpoints);
	}
	
	@Test	
	public	void AccuracySinNegate() throws PowerException, FactorialException
	{
		assertNotEquals(Math.sin(4), TrigonometricFunctions.sin(1), decimalpoints);
	}
	
	@Test	
	public	void AccuracyCosine() throws PowerException, FactorialException
	{
		assertEquals(Math.cos(3), TrigonometricFunctions.cos(3), decimalpoints);
	}
	
	@Test	
	public	void AccuracyCosineNegate() throws PowerException, FactorialException
	{
		assertNotEquals(Math.cos(3), TrigonometricFunctions.cos(5), decimalpoints);
	}
	
	@Test	
	public	void AccuracyTangent() throws PowerException, FactorialException
	{
		assertEquals(Math.tan(3), TrigonometricFunctions.tan(3), decimalpoints);
	}
	
	@Test	
	public	void AccuracyTangentNegate() throws PowerException, FactorialException
	{
		assertNotEquals(Math.tan(3), TrigonometricFunctions.tan(5), decimalpoints);
	}
	
	@Test
	public	void AccuracyValueinradianSin() throws PowerException, FactorialException
	{
		assertEquals(Math.sin(8.6), TrigonometricFunctions.sin(8.6), decimalpoints);
	}
	
	@Test
	public	void AccuracyValueinradianCos() throws PowerException, FactorialException
	{
		assertEquals(Math.cos(0.5), TrigonometricFunctions.cos(0.5), decimalpoints);
	}
	
	@Test
	public	void AccuracyValueinradianTan() throws PowerException, FactorialException
	{
		assertEquals(Math.tan(0.86), TrigonometricFunctions.tan(0.86), decimalpoints);
	}
	
	@Test
	public	void AccuracyValueindegreeSin() throws PowerException, FactorialException
	{
		assertEquals(Math.sin(TrigonometricFunctions.degreeToRadian(30)), 
				TrigonometricFunctions.sin(TrigonometricFunctions.degreeToRadian(30)), 
				decimalpoints);
	}
	
	@Test
	public	void AccuracyValueindegreeSinNegate() throws PowerException, FactorialException
	{
		assertNotEquals(Math.sin(TrigonometricFunctions.degreeToRadian(45)), 
				TrigonometricFunctions.sin(TrigonometricFunctions.degreeToRadian(60)), 
				decimalpoints);
	}
	
	
	
	
	
	
	
}
