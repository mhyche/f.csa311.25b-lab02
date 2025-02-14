package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Choose a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.print("Enter the number of the shape you want to choose: ");
            int shapeChoice = scanner.nextInt();

            Shape shape = null;
            
            switch (shapeChoice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Enter the height of the rectangle: ");
                    double height = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(height, width);
                    break;
                case 3:
                    System.out.print("Enter the side length of the square: ");
                    double sideLength = scanner.nextDouble();
                    shape = new Square(sideLength);
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid shape.");
                    continue;
            }

            System.out.println("Do you want to calculate:");
            System.out.println("1. Area");
            System.out.println("2. Perimeter");
            System.out.print("Enter your choice: ");
            int calculationChoice = scanner.nextInt();

            double result = 0;
            
            if (calculationChoice == 1) {
                result = shape.getArea();
                System.out.println("The area of the shape is: " + result);
            } else if (calculationChoice == 2) {
                result = shape.getPerimeter();
                System.out.println("The perimeter of the shape is: " + result);
            } else {
                System.out.println("Invalid choice! Please enter 1 for Area or 2 for Perimeter.");
                continue;
            }

            System.out.print("Do you want to try another shape? (yes/no): ");
            String tryAgain = scanner.next();
            if (tryAgain.equalsIgnoreCase("no")) {
                continueRunning = false;
            }
        }

        scanner.close();
        System.out.println("Thank you for using the shape calculator!");
    }
}
