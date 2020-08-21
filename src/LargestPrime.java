public class LargestPrime {
    public static int getLargestPrime(int number){
        if (number < 1) return -1;
        int largestPrimeFactor = -1;
        for (int n =2; n <= number;n++){   //check if n is a factor
            if (number % n == 0){
                boolean isPrime = true;
                for (int p = 2; p <= n/2; p++){  //if n has factors then it's not prime
                    if (n % p == 0)  {
                        isPrime = false;
                    }
                }
                if ((isPrime) && (n > largestPrimeFactor)){
                    largestPrimeFactor = n;
                }
            }
        }
        return largestPrimeFactor;
    }
}
