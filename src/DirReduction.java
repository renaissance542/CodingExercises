import java.util.ArrayList;
import java.util.Arrays;

public class DirReduction {
   public static String[] dirReduc(String[] arr) {
      // go through sequentially.
      // check the current and next value, and remove them both if opposites
      // change processing to true to keep the loop going
      // return the final array after processing = false
      ArrayList<String> array = new ArrayList<>(Arrays.asList(arr));

      boolean canceled = true;
      while(canceled && array.size()>1){
         for (int i =0; i < array.size()-1; i++){
//            System.out.println("i = " + i);
            if (areOpposites(array.get(i), array.get(i+1))){
//               System.out.println("removing " + array.get(i));
               array.remove(i);
//               System.out.println("removing " + array.get(i));
               array.remove(i);
               canceled = true;
               break;
            } else {
               canceled = false;
            }
         }
      }
//      String[] arr2 = new String[array.toArray()];
      return array.toArray(new String[0]);
   }
   private static boolean areOpposites (String dir1, String dir2){
      if (dir1.compareToIgnoreCase("NORTH")==0){
         if (dir2.compareToIgnoreCase("SOUTH") ==0){
            return true;
         }
      }
      if (dir1.compareToIgnoreCase("SOUTH")==0){
         if (dir2.compareToIgnoreCase("NORTH") ==0){
            return true;
         }
      }
      if (dir1.compareToIgnoreCase("EAST")==0){
         if (dir2.compareToIgnoreCase("WEST") ==0){
            return true;
         }
      }
      if (dir1.compareToIgnoreCase("WEST")==0){
         if (dir2.compareToIgnoreCase("EAST") ==0){
            return true;
         }
      }
      return false;
   }
}
