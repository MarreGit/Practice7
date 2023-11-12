package Counter2Package;

import java.util.Scanner;

public class CounterMain {
    public static void main(String[] args) {
        Counter user = new Counter(0,0,"stop");

        Scanner scan = new Scanner(System.in);
        int lineCount = 0;
        int characterCount = 0;

        System.out.println("Write a text for each row and press Enter");
        System.out.println("Close the program by typing the word \"stop\" ");

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.equals("stop")) {
                break; // Avsluta loopen om användaren trycker på Enter utan text
            }
            lineCount++;
            characterCount += line.length();

        }

        System.out.println("You have typed in " + lineCount + " rows and " + characterCount + " " +
                "characters excluding your word \"stop\" ");

    }
}