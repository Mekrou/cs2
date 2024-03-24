import java.io.*;
import java.util.*;

public class App {
    static boolean validFileNames = false;
    static String[] fileNames = new String[2];
    static Scanner[] files = new Scanner[2];
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (!validFileNames) {
            fileNames = askForFileNames();
            files = openFiles(fileNames);
        }
        keyboard.close();

        try {
            short lineNumber = 1;
            while (files[0].hasNextLine() || files[1].hasNextLine()) {
                String dataline1 = files[0].nextLine();
                String dataline2 = files[1].nextLine();
                
                if (!dataline1.equals(dataline2)) {
                    System.out.println("Line " + lineNumber);
                    System.out.println("< " + dataline1 + "\n> " + dataline2);
                }
                
                lineNumber++;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Files have different number of lines");
        } 
    }

    public static String compareLines(String a, String b) {
        String message = new String();

        if (!a.equals(b)) {
            message = "< " + a + "\n> " + b;
        }

        return message;
    }

    // Creates readable scanners for the files the user entered in askForFileNames()
    public static Scanner[] openFiles(String[] fileNames) {
        Scanner[] scanners = new Scanner[2];
        try {
            for (int i = 0; i < fileNames.length; i++) {
                File file = new File(fileNames[i]);
                scanners[i] = new Scanner(file);
            }

            validFileNames = true;
        } catch (FileNotFoundException e) {
            System.out.println("At least one of those files could not be found. Please re-enter them.");
        }
        
        return scanners;
    } 

    // Prompts users to enter the two names of the files they want to compare
    public static String[] askForFileNames() {
        try {
            System.out.println("Enter the first file name: ");
            String first = keyboard.next();
            keyboard.nextLine();

            System.out.println("Enter the second file name: ");
            String second = keyboard.next();
            keyboard.nextLine();

            String[] choices = { first, second };
            return choices;
        } catch (Exception e) {
            System.out.println(e);
            return new String[0];
        }
    }
}
