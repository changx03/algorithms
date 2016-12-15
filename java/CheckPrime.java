/**
 * CheckPrime
 * Created by Luke Chang on 16/12/2016. Contact email: luke.x.chang@gmail.com
 */
public class CheckPrime {

    public static boolean isPrime(int n) {
        if(n % 2 == 0) return false;

        for(int i = 3; i * i <= n; i += 2) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(CheckPrime.isPrime(83));
    }
}
