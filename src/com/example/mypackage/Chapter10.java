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
			input += Integer.parseInt(scan.nextLine());
		}
		
		System.out.println(input / 10);
	}

}
