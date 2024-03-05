package com.javaExceptionHandlingWithtryCatchFinally;

import java.util.Scanner;

//scenario-1: try-catch 
//scenario-2: try-catch-catch 
//scenario-3: try-catch-finally 
//scenario-4: try-finally 
//scenario-5: nested try-catch

public class TestClass {

	public static void main(String[] args)
	{
		
		
		Scanner scanner = new Scanner(System.in);//Input Stream resource opened
		
		System.out.println("Enter values:");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		try//problematic part
		{
			System.out.println(Example1.calculate(a, b));
			try//problematic part
			{
				System.out.println(Example1.calculate(a, b));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally//compulsory block executed
		{
			scanner.close();
			System.out.println("finally block");
		}
		
	}

}
