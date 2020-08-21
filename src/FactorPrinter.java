public class FactorPrinter {
    public static void printFactors (int number){
        if (number < 1){
            System.out.println("Invalid Value");
        } else {
            String factors = "1";
            for (int n = 2; n <= number; n++){
                if (number % n == 0){
                    factors += " " + n;
                }
            }
            System.out.println(factors);
        }
    }
}
