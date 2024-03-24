// You’ll need two text files to test your code. Using your favorite text editor (notepad on
// windows, or textedit on mac, or similar) create two files with almost the same text in
// each. Be sure to save it as a text (.txt) file, not a .doc or anything else.
// 2. Write a program to compare the two files and output their differences.
// a. Prompt the user for both file names.
// b. Open both files, and read them in line by line. Keep track of what line number
// you are on.
// c. Compare the line you read from file one, with the line you read from file two.
// i. If they are the same, do nothing.
// ii. If they are different, output the differences as follows:
// 1. You’ll first output the line number that is different,
// 2. Next, you’ll output the symbol “< ” and then the line from the first
// file.
// 3. Finally, output a “> ” and the line from the second file.
// d. If the two files have a different number of lines, you should output “Files have
// different number of lines”/
// 3. Be sure to handle all IO exceptions that could occur.

import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            String[] fileNames = askForFileNames();

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Scanner[] openFiles(String[] fileNames) {
        Scanner[] scanners = {};
        for (String file : fileNames) {
            Scanner sc = new Scanner(file);
            
        }
    } 

    public static void readTextFile(File file) {
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String dataline = fileScanner.nextLine();
                System.out.println(dataline);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }

    // Prompts users to enter the two names of the files they want to compare
    public static String[] askForFileNames() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first file name: ");
            String first = sc.next();
            sc.nextLine();

            System.out.println("Enter the second file name: ");
            String second = sc.next();
            sc.nextLine();

            String[] choices = { first, second };
            return choices;
        } catch (Exception e) {
            System.out.println(e);
            return new String[0];
        }
    }
}
