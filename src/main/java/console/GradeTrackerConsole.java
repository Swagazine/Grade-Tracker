package console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import math.*;

public class GradeTrackerConsole {
    public static void main(String[] args) {

        String input;
        int weighting;
        double mark;
        int total;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("** -- Grade Tracker Console -- **");

        while (true) {
            try {
                System.out.println("Enter in assignment weighting (numeric): ");
                input = br.readLine();
                weighting = Integer.parseInt(input);

                System.out.println("Enter in mark: ");
                input = br.readLine();
                mark = Double.parseDouble(input);

                System.out.println("What was the mark out of? ");
                input = br.readLine();
                total = Integer.parseInt(input);

                GradeFunctions.calculateValues(weighting, mark, total);

                while (true) {
                    System.out.println("Do you want to submit another entry? Y/N: ");
                    input = br.readLine();
                    if (input.equals("Y") || input.equals("y")) {
                        break;
                    }   else if (input.equals("N") || input.equals("n")) {
                        System.out.println("Thank you for using the Grade Tracker Console");
                        System.exit(0);
                    }   else {
                        System.out.println("Invalid response, try again");
                    }
                }

            }   catch (NumberFormatException e) {
                System.out.println("Input error, use numbers only");
            }   catch (IOException e) {
                System.out.println("I/O error, please try again");
            }
        }
    }
}