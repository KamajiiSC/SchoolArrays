package com.example.mypackage;

import java.util.Scanner;

public class Chapter10 {

	public static void main(String[] args) {
		//Brandon Schaen
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		//Get Input
		for(int i = 0;  i < 10; i++) {
			
			System.out.println("Enter number " + (i +1 ) + " : ");
			
			//try to parse int
			try {
				input += Integer.parseInt(scan.nextLine());
			}
			//Print a statement and decrement the loop by one so you cant pass this number
			catch(NumberFormatException exception) {
				System.out.println("Please enter a valid integer");
				i--;
			}
			
		}
		
		//Prints out the numbers averaged by 10 
		System.out.println(input / 10);
	}

}
