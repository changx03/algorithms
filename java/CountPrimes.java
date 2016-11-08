import java.util.Arrays;

/**
 * Created by xcha011 on 11/8/2016.
 */
public class CountPrimes {

    public int countPrimes(int n) {
        Boolean[] b =  new Boolean[n];
        Arrays.fill(b, true);
        int sqrt_n = (int)Math.sqrt(n);
        int count = 0;
        for(int i = 2; i < n; i++) {
            if(b[i]) {
                count++;
                if(i <= sqrt_n) {
                    int i2 = i * i;
                    for(int j = 0, k = i2; k < n; j++, k = i2 + j * i)
                        b[k] = false;
                }
            }
        }
        return count;
    }

    public static void main(String[] argv) {
        System.out.println(new CountPrimes().countPrimes(7));
    }
}
