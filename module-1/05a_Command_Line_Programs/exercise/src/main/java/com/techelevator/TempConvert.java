package com.techelevator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TempConvert {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the temperature:");
		String originalTempInput = input.nextLine();
		int originalTemp = Integer.parseInt(originalTempInput);

		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");
		String tempToBeConverted = input.nextLine();

		if (tempToBeConverted.equals("F")){
			int newTemp = (int)((originalTemp- 32) / 1.8);
			System.out.println(originalTemp + "F" + " is " + newTemp + "C.");

		} else {
			int toFTemp = (int)((originalTemp * 1.8) + 32);
			System.out.println(originalTemp + "C" + " is " + toFTemp + "F.");
		}
	}

}
