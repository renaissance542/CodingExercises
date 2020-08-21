import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
   public static List<Long> sumDigPow(long a, long b) {
      List<Long> values= new ArrayList<>();
      int counter=0;
      for (long i = a; i<=b; i++){
         List<Long> digits = new ArrayList<>();
         int digitCount = 0;
         long number = i;
         long sum = 0;
         while (number > 0){
            digits.add(number%10);
            digitCount++;
            number /=10;
         }
         for (int j = 0; j<digitCount; j++){
            sum += Math.pow(digits.get(j), (digitCount-j));
         }
         if(sum==i){
            values.add(counter, i);
            counter++;
         }
      }
      return values;
   }
}
