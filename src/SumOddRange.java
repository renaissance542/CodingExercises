public class SumOddRange {

    public static boolean isOdd (int x){
        if (x <=0) return false;
        if (x % 2 == 0) return false;
        else return true;
    }

    public static int sumOdd (int start, int end){
        if ((start < 1) || (end < 1) || (start > end)){
            return -1;
        }

        int sumOfOdds =0;
        for (int n = start; n <= end; n++){
            if (isOdd(n)){
                sumOfOdds += n;
            }
        }
        return sumOfOdds;
    }
}
