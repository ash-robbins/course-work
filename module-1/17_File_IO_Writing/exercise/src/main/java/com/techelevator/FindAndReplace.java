package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FindAndReplace findAndReplace = new FindAndReplace();
        findAndReplace.run();
    }

    public void run() {
        /* Your code goes here */

        //Ask user for search word
        System.out.println("What is the search word?");
        String inputSearchWord = userInput.nextLine();

        //Ask user for replacement word
        System.out.println("What is the replacement word?");
        String inputReplacementWord = userInput.nextLine();

        //Ask user for source file
        System.out.println("What is the source file?");
        String inputSourceFile = userInput.nextLine();

        //Ask user for destination file
        System.out.println("What is the destination file?");
        String inputDestinationFile = userInput.nextLine();

        //Add read file to variable
        File toRead = new File(inputSourceFile);

        //Add write file to variable
        File toWrite = new File(inputDestinationFile);

        try (Scanner fileToRead = new Scanner(toRead); PrintWriter fileToWrite = new PrintWriter(toWrite)){
            while (fileToRead.hasNextLine()){
                String lineOfInput = fileToRead.nextLine();
                fileToWrite.println(lineOfInput.replace(inputSearchWord, inputReplacementWord));
            }
        } catch (FileNotFoundException e){
            System.err.println("Cannot open the file for writing");
        }



    }

}
