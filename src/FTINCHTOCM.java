import java.text.DecimalFormat;

public class FTINCHTOCM {

    public static void main(String[] args) {

        calculateFeetAndInchesToCentimeters(17);
    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches <0) || (inches > 12))) {
            System.out.println("Invalid!");
            return -1;

        }

            // 1 inch = 2.54cm and one foot = 12 inches
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        DecimalFormat df4 = new DecimalFormat(".0000");

        System.out.println(feet + " feet, " + inches + " inches = " + df4.format(centimeters)+ " cm.");

        return centimeters;
    }

    public static double calculateFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        DecimalFormat df4 = new DecimalFormat(".####");

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        df4.format(remainingInches);
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");

        return calculateFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
