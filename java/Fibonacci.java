/**
 * Created by gungr on 15/11/2016.
 */
public class Fibonacci {
    public static int fibonacciRecusion(int num) {
        if(num <= 1) return num;
        return fibonacciRecusion(num - 1) + fibonacciRecusion(num - 2);

    }

    public static int fibonacciIterative(int num) {
        if(num <= 1) return num;
        int fib0 = 0;
        int fib1 = 1;
        int fib = 1;
        for(int i = 1; i < num; i++) {
            fib = fib0 + fib1;
            fib0 = fib1;
            fib1 = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++) {
            System.out.print(fibonacciRecusion(i) + " ");
        }
        System.out.println();
        for(int i = 0; i < 20; i++) {
            System.out.print(fibonacciIterative(i) + " ");
        }
    }
}
