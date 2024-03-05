package com.javaExceptionHandlingWithThrowsAndThrow;

import java.util.Scanner;

//scenario-1: try-catch 
//scenario-2: try-catch-catch 
//scenario-3: try-catch-finally 
//scenario-4: try-finally 
//scenario-5: nested try-catch

public class TestClass {

	public static void main(String[] args)
	{
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter values:");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		try
		{
			System.out.println(Example1.calculate(a, b));
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			scanner.close();
		}
		
	}

}
