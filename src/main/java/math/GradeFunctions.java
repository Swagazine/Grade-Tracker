package math;

import java.text.DecimalFormat;

public class GradeFunctions {

    public static void calculateValues(double mark, int total, int weight) {
        System.out.println("Total percentage of assignment: " + calculateGrade(mark, total) + "/100");
        System.out.println("Total percentage in unit (weighted): " + calculateGrade(mark, total, weight) + "/100");
    }

    public static double calculateGrade(double mark, int total) {
        DecimalFormat df = new DecimalFormat(".##");
        return Double.parseDouble(df.format((mark/total * 100)));
    }

    public static double calculateGrade(double mark, int total, int weight) {
        DecimalFormat df = new DecimalFormat(".##");
        return Double.parseDouble(df.format((mark/total * weight)));
    }
}
