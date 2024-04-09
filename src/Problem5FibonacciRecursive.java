import java.util.Scanner;

public class Problem5FibonacciRecursive {
    
    /**
     * Calculates the nth Fibonacci number using recursion.
     * 
     * @param n The index of the Fibonacci number to find
     * @return The nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the index of the Fibonacci number: ");
        int n = scanner.nextInt();
        
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
        
        scanner.close();
    }
}


