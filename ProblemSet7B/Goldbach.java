import java.util.ArrayList;

public class Goldbach
{
    public int[] gold(int n){
        int[] a = new int[2];
        ArrayList<Integer> primes = Eratosthenes.sieve(n);

        for(int i = 0; i < n; i++){
            int j = n-i;
            if (primes.contains(i) && primes.contains(j)){
                a[0] = i;
                a[1] = j;
                System.out.println(i + " " + j);
                return a;
            }
        }
        return a;
    }
}
