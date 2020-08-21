public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        if (number < 0){
            number *= -1;
        }
        int workingValue = number;
        int reverseValue = 0;
        while (workingValue > 0){
            reverseValue *= 10;
            reverseValue += workingValue % 10;
            workingValue /= 10;
        }

        if (reverseValue == number){
            return true;
        } else {
            return false;
        }

    }
}
