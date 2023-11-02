package com.UserDefinedMethods;

public class MethodExlample2 {

	public void addition() 		// Public Method Can Be Accessed in Any Java Class
	{
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1+var2;
		
		System.out.println(" The Value Of The Variable var3 After Addition is :- "+var3);
	}
	
	public static void main(String[] args) {
		
		MethodExlample2 m2 = new MethodExlample2();
		m2.addition();
		
		
		
		
	}
	
	
	
	
}
