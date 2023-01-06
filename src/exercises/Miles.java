package exercises;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles you have driven: ");
        double numOfMiles = input.nextDouble();

        System.out.println("What amount of gas in gallons you have consumed: ");
        double numOfGallons = input.nextDouble();

       System.out.println("Miles-per-gallon is " + numOfMiles / numOfGallons);
    }
}
