import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by gungr on 6/11/2016.
 */
public class PrimeSieve {

    List primeSieve(int n) {    // from 2 to n
        n++;
        Boolean[] b =  new Boolean[n];
        Arrays.fill(b, true);
        int sqrt_n = (int)Math.sqrt(n);
        for(int i = 2; i <= sqrt_n; i++) {
            if(b[i]) {
                int i2 = i * i;
                for(int j = 0, k = i2; k < n; j++, k = i2 + j * i)
                    b[k] = false;
            }
        }
        List prime = new ArrayList<>();
        for(int i = 2; i < n; i++) {
            if(b[i])
                prime.add(i);
        }
        return prime;
    }

    List primeSieve(int start, int end) {
        int n = end++;
        Boolean[] b = new Boolean[n];
        Arrays.fill(b, true);
        int sqrt_n = (int)Math.sqrt(n);
        for (int i = 2; i <= sqrt_n; i++) {
            if(b[i]) {
                int i2 = i * i;
                for(int j = 0, k = i2; k < n; j++, k = i2 + j * i)
                    b[k] = false;
            }
        }
        List prime = new ArrayList();
        for (int i = start; i < n; i++) {
            if(b[i])
                prime.add(i);
        }
        return  prime;
    }

    public static void main(String[] argv) {
        int n = 10;
        PrimeSieve ps = new PrimeSieve();
//        List prime = ps.primeSieve(n);
//        for(Object o: prime){
//            System.out.println((int)o);
//        }

        List prime = ps.primeSieve(6, 21);
        for(Object o: prime){
            System.out.println((int)o);
        }
    }
}
