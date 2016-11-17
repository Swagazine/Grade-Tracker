package console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import math.*;

public class Main {
    public static void main(String[] args) {

        ConsoleFunctions functions = new ConsoleFunctions();

        String input = null;
        int weight;
        double mark;
        int total;

        double unitTotal = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("** -- Grade Tracker Console -- **");
        System.out.println("Type 'quit' to exit at any time");

        while (true) {
            try {
                System.out.println("Enter in assignment weighting (numeric): ");
                input = br.readLine();
                weight = Integer.parseInt(input);

                System.out.println("Enter in mark: ");
                input = br.readLine();
                mark = Double.parseDouble(input);

                System.out.println("What was the mark out of? ");
                input = br.readLine();
                total = Integer.parseInt(input);

                unitTotal = unitTotal + GradeFunctions.calculateGrade(mark, total, weight);

                System.out.println("Total percentage for assignment: " + GradeFunctions.calculateGrade(mark, total) + "/100");
                System.out.println("Percentage added to total:  " + GradeFunctions.calculateGrade(mark, total, weight) + "/100");
                System.out.println("Total marks overall in unit: " + unitTotal + "/100");

                while (true) {
                    System.out.println("Do you want to submit another entry? y/n: ");
                    input = br.readLine();
                    if (functions.isYes(input)) {
                        break;
                    }   else if (functions.isNo(input) || functions.isQuit(input)) {
                        System.out.println("Thank you for using the Grade Tracker Console");
                        System.exit(0);
                    }   else {
                        System.out.println("Invalid response, try again");
                    }
                }

            }   catch (NumberFormatException e) {

                if (functions.isQuit(input)) {
                    System.out.println("Exiting console...");
                    System.exit(0);
                }

                System.out.println("Input error, use numbers only");

            }   catch (IOException e) {
                System.out.println("I/O error, please try again");
            }
        }
    }
}