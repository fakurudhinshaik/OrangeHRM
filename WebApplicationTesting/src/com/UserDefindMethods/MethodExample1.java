package com.UserDefindMethods;

public class MethodExample1 {
	
	public void addition ()
	{
		int var1=30;
		int var2=20;
		int var3;
		
		var3=var1+var2;
		System.out.println(" The Addition of Adding Variable Values is ");
		System.out.println(" The Variable Value var3 after adding is:- "+var3);
		
		var3=var1-var2;
		System.out.println(" The Subtraction of adding varibale values is ");
		System.out.println(" The Variable Value var3 After Subtraction is :- "+var3);
		
		var3=var1*var2;
		System.out.println(" The Multiplication of adding varibale values is ");
		System.out.println(" The Variable Value var3 After Multiplication is :- "+var3);
		
		
	}

	public static void main(String[] args){
		
		MethodExample1 m1 = new MethodExample1();
		
		m1.addition();
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
