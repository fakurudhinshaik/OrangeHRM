package com.UserDefinedMethods;

public class MethodExample3 {

	public void subtraction() //Can be accessed only within the class in which it is created
							//Can also be accessed in the same class for multiple number of times
	{						//Private method cannot be accessed in any other different class
	int var1=20;
	int var2=30;
	int var3;
	
	var3=var1-var2;
	
	System.out.println("The value of the variable var3 after subtraction is :"+var3);
	}
	
	public static void main(String[] args) {
		
		MethodExample3 m3 = new MethodExample3();
		System.out.println("Subtration method of methodExample3 Java Class ");
		m3.subtraction();
		
		System.out.println("Multiplication method of MethodExample3 Java Class ");
		MethodExample3 m = new MethodExample3();
		m.multiplication();
		
	}
		
	protected void multiplication()
	
	{
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1*var2;
		System.out.println("The value of the variable var3 after Multiplication is :"+var3);
	}
		
	
	
}
