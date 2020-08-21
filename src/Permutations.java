import java.util.ArrayList;
import java.util.List;

public class Permutations {
   public static List<String> singlePermutations(String s) {
      char[] permutation = s.toCharArray();
      List<String> finalList = new ArrayList<>();
      if (permutation.length == 1){
         finalList.add(new String(permutation));
      } else {
         int position = 0;
         for (int i = 0; i < permutation.length; i++) {
            char[] temp = permutation.clone();
            listBuilder(position, swapChar(position, i, temp), finalList);
         }
      }
      return finalList;
   }

   private static void listBuilder (int position, char[] word, List<String> finalList) {
      position++;
      char[] temp = word.clone();
      String wordAsString = new String(word);
      if (position == temp.length-1){
         if (!finalList.contains(wordAsString)){
            finalList.add(wordAsString);
         }
      } else {
         for (int i = position; i<temp.length; i++){
            listBuilder(position, swapChar(position, i, temp), finalList);
         }
      }
   }

   private static char[] swapChar (int pos1, int pos2, char[] word){
      char[] temp= word.clone();
      char tempChar = temp[pos1];
      temp[pos1] = temp[pos2];
      temp[pos2] = tempChar;
      return temp;

   }
}
