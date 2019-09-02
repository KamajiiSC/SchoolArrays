package com.example.mypackage;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		int[] counter = new int[51];
		int[] input = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number between 0-50: ");
		
		//Get Input
		for(int i = 0;  i < input.length; i++) {
			System.out.println("Enter number " + (i +1 ) + " : ");
			input[i] = scan.nextInt();
		}
		
		//Increment counter array indexes corresponding to input
		for(int i = 0; i< input.length; i++) {
			counter[input[i]]++;
		}
		
		//Print stored values
		for(int i = 0; i< counter.length; i++) {
			if((counter[i] > 0)) {
				System.out.println(i + ": " + counter[i]);
			}
		}
	}

}
