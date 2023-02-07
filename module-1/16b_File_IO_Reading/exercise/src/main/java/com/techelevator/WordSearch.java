package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		WordSearch wordSearch = new WordSearch();
		wordSearch.run();
	}

	public void run() {
		/* Your code goes here */

		//Prompt user for filesystem
		System.out.println("What is the fully qualified name of the file that should be searched?");
		String inputPathFile = userInput.nextLine();
		//System.out.println(inputPathFile);

		//Prompt user for search word
		System.out.println("What is the search word you are looking for?");
		String inputSearchWord = userInput.nextLine();
		//System.out.println(inputSearchWord);

		//Case-sensitive question
		System.out.println("Should the search be case sensitive? (Y/N)");
		String caseResponse = userInput.nextLine();

		//Add file to variable
		File fileToRead = new File(inputPathFile);

		//Add count variable
		int count = 0;

		//Open / Make file read ready
		if (caseResponse.toLowerCase().equals("y")) {
			try (Scanner fileForRead = new Scanner(fileToRead)) {
				while (fileForRead.hasNextLine()) {
					String lineOfInput = fileForRead.nextLine();
					count += 1;
					if (lineOfInput.contains(inputSearchWord)) {
						System.out.println(count + ") " + lineOfInput);
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println("The file does not exist");
			}
		}
		if (caseResponse.toLowerCase().equals("n")) {
			try (Scanner fileForRead = new Scanner(fileToRead)) {
				while (fileForRead.hasNextLine()) {
					String lineOfInput = fileForRead.nextLine();
					count += 1;
					if (lineOfInput.toLowerCase().contains(inputSearchWord.toLowerCase())) {
						System.out.println(count + ") " + lineOfInput);
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println("The file does not exist");
			}
		}



		}

	}


