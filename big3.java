import java.util.Scanner;

public class BiggestOfThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the three numbers from the user
        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // Find the biggest number
        int biggest = num1;
        if (num2 > biggest) {
            biggest = num2;
        }
        if (num3 > biggest) {
            biggest = num3;
        }

        // Print the biggest number
        System.out.println("The biggest number is: " + biggest);
    }
}
