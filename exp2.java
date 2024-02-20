import java.util.Scanner;

public class exp2 {
    private int number;

    public exp2(int number) {
        this.number = number;
    }

 
    public int factorial() {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    
    public int fibonacci() {
        if (number <= 1)
            return number;
        int fib1 = 0, fib2 = 1, fib = 1;
        for (int i = 2; i <= number; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }

    
    public boolean prime() {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }


    public int digitSum() {
        int sum = 0;
        int num = number;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        exp2 arithmetic = new exp2(inputNumber);
        System.out.println("The Factorial of give number is: " + arithmetic.factorial());
        System.out.println("The Fibonacci of given number is: " + arithmetic.fibonacci());
        System.out.println("Is Prime: " + arithmetic.prime());
        System.out.println("The sum of the given digits is : " + arithmetic.digitSum());

        
    }
}

