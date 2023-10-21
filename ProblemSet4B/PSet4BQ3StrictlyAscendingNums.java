public class PSet4BQ3StrictlyAscendingNums{
    public int PSet4BQ3StrictlyAscendingNums(int min, int max) {
        int count = 0;
        int last = 0;
        int next = 0;
        int n = 0;
        boolean asc = false;
        for(int i = min+1; i < max; i++){
            asc = false;
            n = i;
            // System.out.println(i);

            while (n> 9){
                last = n % 10;
                n/=10;
                next = n % 10;
                if (last <= next) {
                    asc = false;
                    break;
                }
                asc = true;
            }

            if (i < 10){
                asc = false;
            }
            
            // if(asc) count++;
            // if (asc) System.out.println(i + " is stricly asc, count: " + count);
        }

        return count;
    }
}
