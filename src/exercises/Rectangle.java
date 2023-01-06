package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        int length = input.nextInt();

        System.out.println("Enter width of the rectangle: ");
        int width = input.nextInt();

        int area = length * width;

        System.out.println("Area of rectangle is " + area);

    }
}
