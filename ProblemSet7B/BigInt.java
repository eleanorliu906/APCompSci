import java.util.ArrayList;

public class BigInt
{
    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> arr = new ArrayList<>();

        if (a.size() < b.size()){ // to make a the larger array
            ArrayList<Integer> temp = a;
            a = b;
            b = temp;
        }

        int carry = 0;
        int diff = a.size() - b.size();
        for(int i = a.size()-1; i >=0; i--){
            int s = a.get(i) + carry;
            
            //make sure it is not out of bounds for b
            if (i-diff >= 0) s+= b.get(i-diff);

            arr.add(0, s%10);

            if (s >= 10) carry = 1;
            else carry = 0;
        }
        
        if (carry == 1) arr.add(0, 1);
        return arr;
    }

    // sample driver class to add number
    public static void main(String[] args){
        ArrayList<Integer> c = new ArrayList<>();
        c.add(5);
        c.add(8);
        c.add(7);
        c.add(3);
        c.add(9);

        ArrayList<Integer> d = new ArrayList<>();
        d.add(7);
        d.add(8);
        d.add(6);
        
        ArrayList<Integer> e = add(c, d);
        for(int i = 0; i < e.size(); i++){
            System.out.print(e.get(i));
        }
    }
}

