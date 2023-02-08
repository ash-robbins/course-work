package com.techelevator;

import java.util.Scanner;

public class FileSplitter {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		FileSplitter fileSplitter = new FileSplitter();
		fileSplitter.run();
	}

	public void run() {
		/* Your code goes here */

		//Ask for input file
		System.out.println("Where is the input file (please include the path to the file)?");
		String inputPathFile = userInput.nextLine();

		//Ask how many lines of text
		System.out.println("How many lines of text (max) should there be in the split files?");
		String inputNumberMax = userInput.nextLine();
		int maxNumber = Integer.parseInt(inputNumberMax);


	}

	}


