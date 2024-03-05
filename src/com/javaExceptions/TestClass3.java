package com.javaExceptions;

public class TestClass3 {

	public static void main(String[] args) {
		
		System.out.println(Example1.sayGoodMorning("Hi all, good morning...!"));
		
		System.out.println(Example1.getProduct(0, 100));
		
		try//always have problematic part code in try block
		{
			System.out.println(Example1.getDivision(2000, 0));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try//always have problematic part code in try block
		{
			System.out.println(Example1.getStringLength(null));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println(Example1.sayBye());
		
		try//always have problematic part code in try block
		{
			System.out.println(Example1.getHowAreYouDoing("Doing great."));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
