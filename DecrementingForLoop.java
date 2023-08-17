package com.kn.decrementingforloop;

import java.util.Scanner;

public class DecrementingForLoop {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter a range");
			int num = scan.nextInt();
			
			for(int i=num ; i>=1 ; i--)
			{
				System.out.println(i);
			}
			scan.close();
		}

	
	}


