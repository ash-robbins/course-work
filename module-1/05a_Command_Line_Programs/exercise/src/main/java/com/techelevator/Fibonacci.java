package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		String startNumberInput = input.nextLine();

		input.close();

		int startNumber = Integer.parseInt(startNumberInput);

		String separator = ", ";

		int firstNumber = 0;
		int nextNumber = 1;

		while(firstNumber <= startNumber){
			System.out.print(firstNumber + separator);
			int sumNumber = firstNumber + nextNumber;
			firstNumber = nextNumber;
			nextNumber = sumNumber;
		}

	}
}
