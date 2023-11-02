package com.UserDefinedMethods;

public class MethodExample1 {
	
	// User Defined Method 
	
	// * User Defined method are created for Re-Usability Purpose 
	
	public void hello()
	{
		System.out.println(" Hello Dear Students ");
		
	}

	public void hi() 
	{
		System.out.println(" Learning Selenium WebDriver ");
	}
	
	public static void main(String[] args) {
		
		// Creating an Object for the Current Class
		
		MethodExample1 m1= new MethodExample1();
		
		m1.hello();
		m1.hi();
		m1.hello();
		m1.hi();
		m1.hello();
		m1.hi();
		
		
	}
}
