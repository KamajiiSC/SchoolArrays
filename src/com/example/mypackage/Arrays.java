package com.example.mypackage;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		int[] counter = new int[51];
		int[] input = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		//Get Input
		for(int i = 0;  i < input.length; i++) {
			System.out.println("Enter number " + (i +1 ) + " : ");
			input[i] = scan.nextInt();
		}
		
		//Increment counter array indexes corresponding to input
		for(int i = 0; i< input.length; i++) {
			
		}
	}

}
