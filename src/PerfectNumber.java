public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        int sumOfDivisors = 0;
        for (int n =1; n <= number/2; n++){
            if (number % n == 0){
                sumOfDivisors += n;
            }
        }

        if (sumOfDivisors == number){
            return true;
        } else{
            return false;
        }
    }
}
