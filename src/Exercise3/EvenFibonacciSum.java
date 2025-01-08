package Exercise3;

import java.util.Scanner;

public class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int a = 0, b = 1, sum = 0;

        while (b <= n) {
            if (b % 2 == 0) {
                sum += b;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println("Sum of even Fibonacci numbers up to " + n + " is " + sum);
        scanner.close();
    }
}
