public class PrimeDecomp {
   public static String factors(int n) {
      StringBuilder factors = new StringBuilder();
      int divisionCounter = 0;
      int tempNumber = n;
      for (int i =2; i <= tempNumber/2; i++){
         while(tempNumber%i==0){
            divisionCounter++;
            tempNumber /= i;
         }
         if (divisionCounter > 0){
            factors.append("(" + i + (divisionCounter>1 ? "**" + divisionCounter :"") + ")");
         }

         divisionCounter = 0;
      }
      if(tempNumber != 0){
         factors.append("(" + tempNumber + ")");
      }

      return factors.toString();
   }
}
