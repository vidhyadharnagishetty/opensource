import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    }
}
