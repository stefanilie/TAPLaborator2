
public class ComplexNumber {

	private int _nReal;
	private int  _nImaginary;
	
	public int getReal()
	{
		return this._nReal;
	}
	
	public int getImaginary()
	{
		return this._nImaginary;
	}

	/*
	 * This function prints the complex number as if 
	 * it would be written.
	 */
	public void showNumber()
	{
		System.out.println(this._nReal + "+" + this._nImaginary + "i");
	}
	
	/**
	 * This is a empty constructor.
	 */
 	public ComplexNumber()
	{
		this._nReal = 0;
		this._nImaginary = 0;
	}
	
	/**
	 * This is a parameterized constructor.
	 * It initiates only the real part of the complex number.
	 * @param nReal
	 */
	public ComplexNumber(int nReal)
	{
		this._nReal = nReal;
		this._nImaginary = 0;
	}
	
	/**
	 * This is a parameterized constructor.
	 * It initiates both the real and the imaginary fields of th ComplexNumber Class.
	 * @param nReal
	 * @param nImaginary
	 */
	public ComplexNumber(int nReal, int nImaginary)
	{
		this._nReal = nReal;
		this._nImaginary = nImaginary;
	}
	
	/**
	 * This function calculates the square root of the sum between the 
	 * squares of the imaginary and real parts. 
	 * @return Result of the square root.
	 */
	public double module()
	{
		double toReturn;
		
		toReturn = Math.sqrt(Math.pow(this._nReal, 2) + Math.pow(this._nImaginary, 2));
		
		return toReturn;
	}
	
	/**
	 * This function calculates the conjugate value of the ComplexNumber object.
	 * @param objComplex 
	 * @return 
	 */
	public ComplexNumber conjugate ()
	{
		ComplexNumber objToReturn = new ComplexNumber(this._nReal, -this._nImaginary);
		
		return objToReturn;
	}
	
	/**
	 * This function adds a ComplexNumber to the existing one.
	 * @param objToBeAdded
	 */
	public void sum (ComplexNumber objToBeAdded)
	{
		this._nReal = this._nReal + objToBeAdded.getReal();
		this._nImaginary = this._nImaginary + objToBeAdded.getImaginary();
	}
	
	/**
	 * This function substracts the value provided from the object that calls it.
	 * @param objToSubstract
	 */
	public void substraction (ComplexNumber objToSubstract)
	{
		this._nReal = this._nReal - objToSubstract.getReal();
		this._nImaginary = this._nImaginary - objToSubstract.getImaginary();
	}
	
	/**
	 * This function multiplicates a ComplexNumber with the existing one.
	 * @param objToMultiplicate
	 */
	public void multiplication (ComplexNumber objToMultiplicate)
	{
		this._nReal = this._nReal * objToMultiplicate.getReal();
		this._nImaginary = this._nImaginary + objToMultiplicate.getImaginary();
	}
	
	/**
	 * This function divides the number with the provideed number in the brackets.
	 * @param objToTakeAway
	 */
	public void takeAway (ComplexNumber objToTakeAway)
	{
		this._nReal = this._nReal / objToTakeAway.getReal();
		this._nImaginary = this._nReal / objToTakeAway.getImaginary();
	} 
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ComplexNumber objFirst, objSecond;
		objFirst = new ComplexNumber(10, 5);
		objSecond = new ComplexNumber(20, 10);
		
		System.out.println("The first complex number is: ");
		objFirst.showNumber();
		
		System.out.println("\nIt's module is: " + objFirst.module());
		System.out.println("\nAnd it's conjugate is: ");
		objFirst.conjugate().showNumber();
		
		System.out.println("\n\nThe second one is: ");
		objSecond.showNumber();
		
		System.out.println("\nIt's module is: " + objSecond.module());
		System.out.println("\nAnd it's conjugate is: ");
		objSecond.conjugate().showNumber();
		
		System.out.println("\n\nTheir sum is:");
		objFirst.sum(objSecond);
		objFirst.showNumber();
		
		System.out.println("Their produce is: ");
		objFirst.substraction(objSecond);
		objFirst.multiplication(objSecond);
		objFirst.showNumber();
		objFirst.takeAway(objSecond);
		
		objFirst.showNumber();
		System.out.print(" take away ");
		objSecond.showNumber();
		System.out.print(" is: ");
		objFirst.takeAway(objSecond);
		objFirst.showNumber();
		
		objFirst.multiplication(objSecond);
		
		ComplexNumber obj1 = new ComplexNumber();
		System.out.println("\n\n\n=======================================================\n\n");
		System.out.println("The first number: ");
		obj1.showNumber();
		
		ComplexNumber obj2 = new ComplexNumber(2);
		System.out.println("The second:");
		obj2.showNumber();
		
		ComplexNumber obj3 = new ComplexNumber(3, 4);
		System.out.println("The third");
		obj3.showNumber();
		
	}

}
