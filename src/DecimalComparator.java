public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){
        int firstNumberMultiplied = (int) (firstNumber * 1000);
        int secondNumberMultiplied = (int) (secondNumber * 1000);
        if (firstNumberMultiplied == secondNumberMultiplied){
            return true;
        } else return false;
    }
}
