public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y){
        if ((x < 10) || (x > 99) || (y < 10) || (y > 99)){
            return false;
        }

        // BELOW: for each digit of x, check to see if y has a similar digit.  nested loops

        while (x > 0){
            int workingYvalue = y;
            while (workingYvalue > 0){
                if ((x % 10) == (workingYvalue % 10)){
                    return true;
                }
                workingYvalue /= 10;
            }
            x /= 10;
        }
        return false;
    }
}
