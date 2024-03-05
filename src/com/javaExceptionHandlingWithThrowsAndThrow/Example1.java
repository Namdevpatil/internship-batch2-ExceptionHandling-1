package com.javaExceptionHandlingWithThrowsAndThrow;

public class Example1 
{

	public static int calculate(int x, int y)throws ArithmeticException
	{
		if(y != 0)
		{
			return x/y;
		}
		else
		{
			throw new ArithmeticException("divide by zero is not possible");
		}
		
	}

}
