package math;

import java.text.DecimalFormat;

public class GradeFunctions {
    public static void calculateValues(int weight, double mark, int total) {
        DecimalFormat df = new DecimalFormat(".##");
        System.out.println("Total percentage of assignment: " + df.format((mark/total * 100)) + "/100");
        System.out.println("Total percentage in unit (weighted): " + df.format((mark/total * weight)) + "/100");
    }
}
