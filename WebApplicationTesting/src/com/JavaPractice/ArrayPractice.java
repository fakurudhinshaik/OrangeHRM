package com.JavaPractice;

public class ArrayPractice {
	
	public static void main(String[] args) {
		
		int array1[]= new int[4];
		
		array1[0]=20;
		array1[1]=30;
		array1[2]=40;
		array1[3]=50;
		
		System.out.println(array1[0]);
		
		System.out.println();
		System.out.println("***********");
		System.out.println();
		
		for(int arrayindex=0;arrayindex<array1.length;arrayindex++)
		{
			System.out.println(array1[arrayindex]);
		}
		
		
	}

}