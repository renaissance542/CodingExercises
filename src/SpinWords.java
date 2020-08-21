public class SpinWords {


   public String spinWords(String sentence){
      String newSentence ="";
      String[] words = sentence.split(" ");
      for(int i = 0; i<words.length;i++){
         if (words[i].length()<5){
            newSentence += words[i];
         } else {
            for (int j=words[i].length(); i>0; i--){
               newSentence += words[i].charAt(j);
            }
         }
         if (i<words.length){
            newSentence +=" ";
         }
      }
      return newSentence;
   }

}
