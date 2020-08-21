import java.util.ArrayList;

public class CarMileage {
   public static int isInteresting(int number, int[] awesomePhrases) {
      // return the easy ones to check
      System.out.println("input = " + number);
      for (int n: awesomePhrases){
         if (number == n) return 2;
         if (number == n-1 || number == n-2) return 1;
      }

      // loop the check code for number, number-1, and number-2
      for (int j=0; j<3; j++) {
         // ArrayList of digits created in reverse order
         int temp = number+j;
         if (temp < 100) continue;
         ArrayList<Integer> array = new ArrayList<>();
         do {
            array.add(temp % 10);
            temp /= 10;
         } while (temp > 0);

         // Boolean variables to keep track of failures
         boolean allZeros = true;
         boolean sameNumber = true;
         boolean incrementing = true;
         boolean decrementing = true;
         boolean palindrome = true;
         int lastNumber = 0; // will test for sameNumber, incrementing, and decrementing

         //Loop digits to check for interesting numbers
         for (int i = 0; i < array.size(); i++) {
            if (i > 0) {
               if (array.get(i) != lastNumber + 1) decrementing = false;
               if (((array.get(i) != lastNumber - 1) && (lastNumber >1))
                       || (lastNumber == 1)
                       || (lastNumber == 0  && array.get(i) !=9  ))
                  incrementing = false;
               if (array.get(i) != lastNumber) sameNumber = false;
            }
            if ((i < array.size() - 1) && (array.get(i) != 0)) allZeros = false;
            if (array.get(i) != array.get(array.size() - i - 1)) {
               palindrome = false;
            }
            lastNumber = array.get(i);
         }
         if (allZeros || sameNumber || incrementing || decrementing || palindrome) {
            if (j==0) {
               return 2;
            } else {
               return 1;
            }
         }

      }
      return 0;
   }
}

//Any digit followed by all zeros: 100, 90000
//Every digit is the same number: 1111
//The digits are sequential, incementing†: 1234
//The digits are sequential, decrementing‡: 4321
//The digits are a palindrome: 1221 or 73837
//The digits match one of the values in the awesomePhrases array
//† For incrementing sequences, 0 should come after 9, and not before 1,
// as in 7890. ‡ For decrementing sequences, 0 should come after 1, and not before 9, as in 3210.