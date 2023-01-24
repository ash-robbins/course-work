package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the length:");
		String originalMeasurementInput = input.nextLine();
		int originalMeasurement = Integer.parseInt(originalMeasurementInput);

		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		String measurementToBeConverted = input.nextLine();

		if (measurementToBeConverted.equals("f")) {
			int newMeasurement = (int) (originalMeasurement * 0.3048);
			System.out.println(originalMeasurement + "f" + " is " + newMeasurement + "m.");

		} else {
			int toMeters = (int) (originalMeasurement * 3.2808399);
			System.out.println(originalMeasurement + "m" + " is " + toMeters + "f.");

		}

	}
}
