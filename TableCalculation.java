package com.kn.tables;

import java.util.Scanner;

public class TableCalculation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number=");
		int num = scan.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num + "*" + i + "=" + (num*i));
		}
		scan.close();
	}

}
