/*
 * Written By Nick Lauer
 */
import java.util.Scanner;

public class VectorOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Vector Operations Program!");
            System.out.println("Enter 1. To Add 2 Vectors");
            System.out.println("Enter 2. To Subtract 2 Vectors");
            System.out.println("Enter 3. To Find the Magnitude of a Vector");
            System.out.println("Enter 9. To Quit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                // Vector Addition
                System.out.println("Enter the size of the Vectors");
                int size = scanner.nextInt();

                if (size < 1) {
                    System.out.println("Invalid Size");
                    continue;
                }

                double[] vector1 = new double[size];
                double[] vector2 = new double[size];

                System.out.println("Enter values for Vector1");
                for (int i = 0; i < size; i++) {
                    vector1[i] = scanner.nextDouble();
                }

                System.out.println("Enter values for Vector2");
                for (int i = 0; i < size; i++) {
                    vector2[i] = scanner.nextDouble();
                }

                double[] result = addVectors(vector1, vector2);

                System.out.println("Result:");
                printVector(vector1);
                System.out.println("+");
                printVector(vector2);
                System.out.println("=");
                printVector(result);

            } else if (choice == 2) {
                // Vector Subtraction
                System.out.println("Enter the size of the Vectors");
                int size = scanner.nextInt();

                if (size < 1) {
                    System.out.println("Invalid Size");
                    continue;
                }

                double[] vector1 = new double[size];
                double[] vector2 = new double[size];

                System.out.println("Enter values for Vector1");
                for (int i = 0; i < size; i++) {
                    vector1[i] = scanner.nextDouble();
                }

                System.out.println("Enter values for Vector2");
                for (int i = 0; i < size; i++) {
                    vector2[i] = scanner.nextDouble();
                }

                double[] result = subtractVectors(vector1, vector2);

                System.out.println("Result:");
                printVector(vector1);
                System.out.println("-");
                printVector(vector2);
                System.out.println("=");
                printVector(result);

            } else if (choice == 3) {
                // Find Size of a Vector
                System.out.println("Enter the size of the Vector");
                int size = scanner.nextInt();

                if (size < 1) {
                    System.out.println("Invalid Size");
                    continue;
                }

                double[] vector = new double[size];

                System.out.println("Enter values for the Vector");
                for (int i = 0; i < size; i++) {
                    vector[i] = scanner.nextDouble();
                }
                // Calculating the magnitude of the user-provided vector
                double magnitude = findMagnitude(vector);

                System.out.println("The magnitude is: " + magnitude);

            } else if (choice == 9) {
                // Quit
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid Choice");
            }
        }

        scanner.close();
    }

    // This method adds two vectors and returns the resulting vector
    public static double[] addVectors(double[] vector1, double[] vector2) {
        double[] result = new double[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            result[i] = vector1[i] + vector2[i];
        }
        return result;
    }

    // This method subtracts two vectors and returns the resulting vector
    public static double[] subtractVectors(double[] vector1, double[] vector2) {
        double[] result = new double[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            result[i] = vector1[i] - vector2[i];
        }
        return result;
    }

    // This method finds the magnitude of a vector
    public static double findMagnitude(double[] vector) {
        double sumOfSquares = 0;
        for (int i = 0; i < vector.length; i++) {
            sumOfSquares += Math.pow(vector[i], 2);
        }
        return Math.sqrt(sumOfSquares);
    }

    // This method prints a vector
    public static void printVector(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
