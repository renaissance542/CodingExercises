public class KataBigIntFactorial {

   public static String Factorial(int n) {
      if (n == 0) return "1";
      if (n<3) return "" + n;
      StringBuilder reversedRunningTotal = new StringBuilder(Integer.toString(n)).reverse();
      System.out.println("Input value was " + n);
      char multiplierDigit;
      // first loop through all multipliers
      for (int multiplier = n-1; multiplier>1; multiplier--){
         StringBuilder reversedMultiplier =
                 new StringBuilder(Integer.toString(multiplier)).reverse();
         String multiplierDigitSubtotal = new String("");
         for (int position = 0; position < reversedMultiplier.length() ; position++){
            multiplierDigit = reversedMultiplier.charAt(position);
            StringBuilder product = new StringBuilder(multiplyCharAndReversedString(multiplierDigit,
                    reversedRunningTotal.toString()));
            int powerOfTen = position;
            while (powerOfTen > 0){
               product.insert(0, '0');
               powerOfTen--;
            }
            System.out.println("product = " +product.toString());
            multiplierDigitSubtotal = addReversedStrings(multiplierDigitSubtotal, product.toString() );
            System.out.println("multiplierDigitSubtotal = " + multiplierDigitSubtotal);
         }
         reversedRunningTotal.delete(0, reversedRunningTotal.length());
         reversedRunningTotal.append(multiplierDigitSubtotal.toString());
         System.out.println("reversedRunningTotal = " + reversedRunningTotal.toString());
      }

      return reversedRunningTotal.reverse().toString();
   }

   public static String multiplyCharAndReversedString(char c, String s){
      int multiplier = Character.getNumericValue(c);
      int product = 0;
      int carryOver = 0;
      int sDigit = 0;
      StringBuilder subTotal = new StringBuilder("");
      for(int i = 0; i<s.length(); i++){
         sDigit = Character.getNumericValue(s.charAt(i));
         product = multiplier * sDigit + carryOver;
         subTotal.append(product%10);
         carryOver = product/10;
      }
      if(carryOver > 0){
         subTotal.append(carryOver);
      }
      return subTotal.toString();
   }


   public static String addReversedStrings(String s, String t){
      StringBuilder ss = new StringBuilder(s);
//      ss.reverse();
      StringBuilder tt= new StringBuilder(t);
//      tt.reverse();
      StringBuilder reverseAnswer = new StringBuilder("");
      int ssValue = 0;
      int ttValue = 0;
      int carryOver = 0;
      int total = 0;
      int position = 0;
      while(position<ss.length() || position<tt.length() || carryOver>0){
         if (position<ss.length()){
            ssValue = Character.getNumericValue(ss.charAt(position));
         }
         if (position<tt.length()){
            ttValue = Character.getNumericValue(tt.charAt(position));
         }
         total = ssValue + ttValue + carryOver;
         reverseAnswer.append(total%10);
         carryOver = total/10;
         position++;
         ssValue = 0;
         ttValue = 0;
      }
      return reverseAnswer.toString();
   }

}
