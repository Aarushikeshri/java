import java.util.Scanner;

public class sum_of_integer {
    public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                int sum = 0;
                int number;

                System.out.println("Enter a series of integers. Enter 0 to end.");

                while (true) {
                    System.out.print("Enter an integer: ");
                    number = scanner.nextInt();

                    if (number == 0) {
                        break;
                    }

                    if (number > 0) {
                        sum += number;
                    }
                }

                System.out.println("The sum of all positive integers entered is: " + sum);
                scanner.close();
            }
        }

