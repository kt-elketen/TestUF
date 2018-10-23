import java.util.Scanner;
import java.lang.*;
// testing git push
public class SciCalculator
{

    public static void main(String[] args)
    {
        double operand1, operand2, sumCalcs = 0;
        int operation = 1;
        int numCalcs = 0;
        double answer = 0.0;
        Scanner reader = new Scanner(System.in);
        while (operation != 0)
        {
            if(operation > 0&&operation <7)
            {
                if(answer == 0)
                {
                    System.out.println("Current Result: " + answer);
                }
                System.out.printf("%nCalculator Menu " + "%n---------------");
                System.out.printf("%n0. Exit Program");
                System.out.printf("%n1. Addition");
                System.out.printf("%n2. Subtraction" + "%n3. Multiplication");
                System.out.printf("%n4. Division%n");
                System.out.printf("5. Exponentiation");
                System.out.printf("%n6. Logarithm" + "%n7. Display Average");
            }
           System.out.printf("%nEnter Menu Selection: ");
            operation = reader.nextInt();
            switch (operation)
            {
                case 0:
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    break;
                case 1:
                    System.out.print("Enter first operand: ");
                    operand1 = reader.nextDouble();
                    System.out.print("Enter second operand: ");
                    operand2 = reader.nextDouble();
                    answer = operand1 + operand2;
                    numCalcs += 1;
                    sumCalcs += answer;
                    System.out.printf("%nCurrent Result: " + "%.2f", answer);
                    break;
                case 2:
                    System.out.print("Enter first operand: ");
                    operand1 = reader.nextDouble();
                    System.out.print("Enter second operand: ");
                    operand2 = reader.nextDouble();
                    answer = operand1 - operand2;
                    numCalcs += 1;
                    sumCalcs += answer;
                    System.out.printf("%nCurrent Result: " + "%.2f", answer);
                    break;
                case 3:
                    System.out.print("Enter first operand: ");
                    operand1 = reader.nextDouble();
                    System.out.print("Enter second operand: ");
                    operand2 = reader.nextDouble();
                    answer = operand1 * operand2;
                    numCalcs += 1;
                    sumCalcs += answer;
                    System.out.printf("%nCurrent Result: " + "%.2f", answer);
                    break;
                case 4:
                    System.out.print("Enter first operand: ");
                    operand1 = reader.nextDouble();
                    System.out.print("Enter second operand: ");
                    operand2 = reader.nextDouble();
                    answer = operand1 / operand2;
                    numCalcs += 1;
                    sumCalcs += answer;
                    System.out.printf("%nCurrent Result: " + "%.2f", answer);
                    break;
                case 5:
                    System.out.print("Enter first operand: ");
                    operand1 = reader.nextDouble();
                    System.out.print("Enter second operand: ");
                    operand2 = reader.nextDouble();
                    answer = Math.pow(operand1, operand2);
                    numCalcs += 1;
                    sumCalcs += answer;
                    System.out.printf("%nCurrent Result: " + "%.2f", answer);
                    break;
                case 6:
                    System.out.print("Enter first operand: ");
                    operand1 = reader.nextDouble();
                    System.out.print("Enter second operand: ");
                    operand2 = reader.nextDouble();
                    answer = Math.log(operand2) / Math.log(operand1);
                    numCalcs += 1;
                    sumCalcs += answer;
                    System.out.printf("%nCurrent Result: " + "%.2f", answer);
                    break;

                case 7:
                    if (numCalcs == 0)
                    {
                        System.out.println("Error: No calculations yet to average!\n");
                    } else
                    {
                        System.out.printf("%nSum of calculations: " + "%.2f", sumCalcs);
                        System.out.printf("Number of calculations: " + "%.2f", numCalcs);
                        double avgCalcs = sumCalcs / numCalcs;
                        System.out.printf("Average of calculations: " + "%.2f", avgCalcs);
                    }
                    break;

                default:
                    System.out.println("Error: Invalid selection!");


            }
        }
    }
}