public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z){
        if ((x < 10) || (x > 1000) || (y < 10) || (y > 1000) || (z < 10) || (z > 1000)){
            return false;
        }
        // below: compare last digit of x to y, then x to z, then y to z
        int xLastDigit = x % 10;
        int yLastDigit = y % 10;
        int zLastDigit = z % 10;

        if ((xLastDigit == yLastDigit) || (xLastDigit == zLastDigit) || (yLastDigit == zLastDigit)){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int x){
        if ((x < 10) || (x > 1000)){
            return false;
        } else {
            return true;
        }
    }
}
