public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if ((first < 10) || (second < 10)){
            return -1;
        }

        for (int n = first/2; n > 0; n--){
            if((first % n == 0) && (second % n == 0)){
                return n;
            }
        }
        return -1;
    }
}
