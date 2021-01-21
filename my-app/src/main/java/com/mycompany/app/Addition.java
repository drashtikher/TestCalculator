package com.mycompany.app;

public class Addition {

	
	public void add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public static void main(String args[]) {
		Addition a1 = new Addition();
		a1.add(5, 5);
		
	}
}
