import java.util.ArrayList;

public class Eratosthenes
{
    public static ArrayList<Integer> sieve(int n)
    {   
        int p = 2;
        int idx = 0;
        ArrayList<Integer> lst = new ArrayList<>();
        
        //fill in the list
        for(int i = 2; i <= n; i++){
            lst.add(i);
        }

        // loop and remove primes
        while(idx < lst.size()){
            p = lst.get(idx);
            for(int i = idx+1; i < lst.size(); i++){
                if (lst.get(i) % p == 0) {
                    lst.remove(i);
                    i--;
                }
                // System.out.println("p: " + p);
            }
            idx++;
        }

        //for(int i = 0; i < lst.size(); i++){
        //    System.out.print(lst.get(i) + "  ");
        //}
        return lst;
    }
}
