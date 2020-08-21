import java.util.*;

public class TopWords {
   public static List<String> top3(String s) {
      String[] words = s.toLowerCase().trim()
              .replaceAll("[^a-z' ]", " ")
              .replaceAll("[']+", "'")
              .split("[ ]+");
      for (String word: words){
         System.out.print(word + ", ");
      }
      System.out.println();
      Map<String, Integer> topWords = new HashMap<>();
      for (String word: words){
         //if it's in the Hashmap, add a counter
         if (word == null || word.length() == 0 || word.compareTo("'") == 0){
            continue;
         }
         if (topWords.containsKey(word)){
            topWords.replace(word, topWords.get(word), topWords.get(word)+1);
            continue;
         } else {
            //if it's not, then put it in
            topWords.put(word, 1);
         }
      }
      System.out.println("Sorted HashMap");
      for (Map.Entry<String, Integer> entry : topWords.entrySet()){
         System.out.println(entry.getKey() + ": " + entry.getValue());
      }
      System.out.println("****************************");


      // dammit I cant sort my hashmap
      int firstCount = 0;
      String firstWord = null;
      int secondCount = 0;
      String secondWord = null;
      int thirdCount = 0;
      String thirdWord = null;
      for (Map.Entry<String, Integer> entry : topWords.entrySet()){
         if (entry.getValue() > firstCount){
            thirdCount = secondCount;
            thirdWord = secondWord;
            secondCount = firstCount;
            secondWord = firstWord;
            firstCount = entry.getValue();
            firstWord = entry.getKey();
         } else if (entry.getValue() > secondCount){
            thirdCount = secondCount;
            thirdWord = secondWord;
            secondCount = entry.getValue();
            secondWord = entry.getKey();
         } else if (entry.getValue() > thirdCount) {
            thirdCount = entry.getValue();
            thirdWord = entry.getKey();
         }
      }
      List<String> finalList = new LinkedList<>();
      if (firstWord != null) finalList.add(firstWord);
      if (secondWord != null) finalList.add(secondWord);
      if (thirdWord != null) finalList.add(thirdWord);
      System.out.println(firstWord + " count is " + firstCount);
      System.out.println(secondWord + " count is " + secondCount);
      System.out.println(thirdWord + " count is " + thirdCount);

      return finalList;
   }
}
