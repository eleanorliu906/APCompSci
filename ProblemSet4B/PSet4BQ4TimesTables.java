public class PSet4BQ4TimesTables
{
    public void PSet4BQ4TimesTables(int n) {
        int maxDigits = findDigits(n*n);
        String s = "";
        
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                int num = i*j;
                int digits = findDigits(num);
                s += ansString(num, digits, maxDigits);
            }
            s += "\n";
        }
        
        System.out.println(s);
    }
    
    public String ansString(int num, int digits, int maxDigits){
        String s = "" + num;
        for (int i = 0; i < maxDigits-digits+1; i++){
            s += " ";
        }
        return s;
    }
    
    public int findDigits(int n){
        int digits = 0;
        while (n>0){
            n/=10;
            digits++;
        }
        return digits;
    }
}
