/**
 * Created by gungr on 28/11/2016.
 */
public class ClimbingStairs {

    // LeetCode 70 Climbing Stairs - Fibonacci number application
    public static int climbStairs(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int ways = 0;
        int one_step_before = 2;
        int two_step_before = 1;
        for(int i = 3; i <= n; i++) {
            ways = one_step_before + two_step_before;
            two_step_before = one_step_before;
            one_step_before = ways;
        }
        return ways;
    }

     private static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n - 2);
    }

    private static int fibonacci2(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int back1 = 1;
        int back2 = 0;
        int cur = 0;
        for(int i = 2; i <= n; i++) {
            cur = back1 + back2;
            back2 = back1;
            back1 = cur;
        }
        return cur;
    }

    // Exceed time limit when stairs = 44
    public static int climbStairs2(int n) {
        return fibonacci(n);
    }

    public static void main(String[] args) {
        int[] fibonacci = {0, 1, 1, 2, 3, 5, 8, 13};
        for(int i = 0; i < fibonacci.length; i++) {
            int val =ClimbingStairs.fibonacci2(i);
            System.out.println(val);
        }
    }
}
