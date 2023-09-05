import java.util.Scanner;

public class test {
    public static void main(String[] args) {  //create a scanner object to read input from user 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();    //prompts user to enter triangle side lengths
        double side3 = input.nextDouble();

        System.out.print("Enter the color of the triangle: "); //prompt user to enter triangle color
        String color = input.next();

        System.out.print("Is the triangle filled? (true/false): "); //prompt user to to enter if triangle is filled
        boolean filled = input.nextBoolean();

        triangle triangle = new triangle(side1, side2, side3);  //sets triangle color and fill status
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("\nTriangle Information:"); //display triangle information on newline
        System.out.println(triangle.toString());
    }
}
