package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter in a series of decimal values (separated by spaces):");
		String seriesInput = input.nextLine();

		input.close();

		String[] seriesDecimalsArray = seriesInput.split(" ");

		int[] decimalConverted = new int[seriesDecimalsArray.length];

		int[] binaryFormula = new int[]{};

		int counter = 0;

		for (int i = 0; i < seriesDecimalsArray.length; i++) {
			decimalConverted[i] = Integer.parseInt(seriesDecimalsArray[i]);
			// System.out.println(seriesDecimalsArray[i] + " in binary is");

		} for (int i = 0; i < decimalConverted.length; i++){
			while (decimalConverted[i] > 0){
				binaryFormula[counter] = decimalConverted[i] % 2;
				counter ++;
				System.out.println(binaryFormula);

			}
		}



		//System.out.println(seriesDecimalsArray[i]);
		//Integer.parseInt(seriesDecimalsArray[i]);
		//counter ++;
		//System.out.println(seriesDecimalsArray);
		//System.out.println(seriesDecimalsArray[i] + " in binary is" );

	}
}

