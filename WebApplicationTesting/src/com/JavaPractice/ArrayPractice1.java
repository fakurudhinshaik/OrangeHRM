package com.JavaPractice;

public class ArrayPractice1 {
	
	public static void main(String[] args) {
		
		int array1[] = new int[6];
		
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		array1[4]=50;
		array1[5]=60;
		
		//System.out.println(array1[5]);
		
		System.out.println();
		System.out.println("*************");
		System.out.println();
		
		for(int arrayindex=0;arrayindex<6;arrayindex++)
		//for(int arrayindex=0;arrayindex<array1.length;arrayindex++);
		{
			System.out.println(array1[arrayindex]);
		}
		
		
	}
	

}
