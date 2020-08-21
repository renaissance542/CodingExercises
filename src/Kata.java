public class Kata {
   public static int[] sortArray(int[] array) {
      for (int k =0; k<array.length; k++){  //loop through the sort as many times as there are
         // odd numbers
//         if(array[k]%2 == 0 || array[k] ==0){  //skip even numbers here
//            continue;
//         }
         for(int i=0; i<array.length-1; i++){ //the last value cannot be position 1 of a swap
            if(array[i]%2 == 0 || array[i] ==0){ //skip
               continue;
            }
            int position1 = i;
            int position2 = -1;
            for(int j=i+1;j<array.length; j++ ){ //find position 2
               if(array[j]%2 != 0 && array[j] !=0){
                  position2 = j;
//                  System.out.println("position 2 = " + position2);
                  break;
               }
            }
            if ((position2 != -1) && (array[position1] > array[position2])){
               swap(array, position1, position2);
               i=position2;
            }
         }

      }

      return array;
   }
   private static void swap(int[] array, int pos1, int pos2){
//      System.out.println("swap(" + pos1 + ", " + pos2 + ") called.  Pos1 = " + array[pos1] +", " +
//              "and " +
//              "Pos2 = " + array[pos2]);
      int temp = array[pos1];
      array[pos1] = array[pos2];
      array[pos2] = temp;

   }
}
