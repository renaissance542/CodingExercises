import java.util.ArrayList;
import java.util.List;

public class ObservedPin {
   public static List<String> getPINs(String observed) {
      //parse string to get observed numbers into an array
      int[] observedCombination = new int[observed.length()];
      for (int i = 0; i < observed.length(); i++){
         observedCombination[i] = Character.getNumericValue(observed.charAt(i));
      }
      ArrayList<String> possibleCombinations = new ArrayList<>();
      int position = 0;

      //use a recursive function to figure out all possible permutations, like last time
      branchAndAppend(position, observedCombination, possibleCombinations);
      return possibleCombinations;
   }

    private static void branchAndAppend (int position, int[] combination,
                                  ArrayList<String> possibleCombinations){
      //if position = length, then convert to string and add to possibleCombinations
       if (position == combination.length){
          String newCombination = "";
          for(int j: combination){
             newCombination += Integer.toString(j);
          }
//          System.out.println("New combination added: " + newCombination);
          possibleCombinations.add(newCombination);

       } else {
          //else create more branches
          int[] branches = getNumbers(combination[position]);
          //loop through branches array and create a ***new branch for each number
          // incrementing the position value by one
          for (int k: branches){
             int[] newBranch = combination.clone();
             newBranch[position] = k;
             branchAndAppend(position+1, newBranch, possibleCombinations);
          }
       }
    }

   private static int[] getNumbers(int n){
      int[] numbers;
      switch(n){
         case 1:
            numbers = new int[] {1,2,4};
            break;
         case 2:
            numbers = new int[] {2,1,3,5};
            break;
         case 3:
            numbers = new int[] {3,2,6};
            break;
         case 4:
            numbers = new int[] {4,1,5,7};
            break;
         case 5:
            numbers = new int[] {5,2,4,6,8};
            break;
         case 6:
            numbers = new int[] {6,3,5,9};
            break;
         case 7:
            numbers = new int[] {7,4,8};
            break;
         case 8:
            numbers = new int[] {8,5,7,9,0};
            break;
         case 9:
            numbers = new int[] {9,6,8};
            break;
         case 0:
            numbers = new int[] {0,8};
            break;
         default:
            numbers = null;
      }
      return numbers;
   }
}
