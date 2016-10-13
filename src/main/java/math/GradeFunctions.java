package math;

import java.text.DecimalFormat;

public class GradeFunctions {
    public static double calculateGrade(double mark, int total) {
        DecimalFormat df = new DecimalFormat(".##");
        return Double.parseDouble(df.format((mark/total * 100)));
    }

    public static double calculateGrade(double mark, int total, int weight) {
        DecimalFormat df = new DecimalFormat(".##");
        return Double.parseDouble(df.format((mark/total * weight)));
    }
}
