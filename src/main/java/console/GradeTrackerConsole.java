package console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

                calculateValues(weighting, mark, total);

                break;

            }   catch (NumberFormatException e) {
                System.out.println("Input error, use numbers only");
            }   catch (IOException e) {
                System.out.println("IO error, please try again");
            }
        }
    }

    private static void calculateValues(int weight, double mark, int total) {
        System.out.println("Total percentage of assignment: " + (mark/total * 100) + "/100");
        System.out.println("Total percentage in unit (weighted): " + (mark/total * weight) + "/100");
    }
}