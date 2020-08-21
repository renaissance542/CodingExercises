public class Greed {
   public static int greedy(int[] dice){
      int oneCounter =0;
      int twoCounter =0;
      int threeCounter =0;
      int fourCounter =0;
      int fiveCounter =0;
      int sixCounter =0;

         for (int i : dice){
            switch (i) {
               case 1:
                  oneCounter++;
                  break;
               case 2:
                  twoCounter++;
                  break;
               case 3:
                  threeCounter++;
                  break;
               case 4:
                  fourCounter++;
                  break;
               case 5:
                  fiveCounter++;
                  break;
               case 6:
                  sixCounter++;
                  break;
               default:
                  System.out.println("Invalid die roll");
                  break;
            }
         }
         int score = (oneCounter%3*100) + (oneCounter/3*1000)
                 + (twoCounter/3*200) + (threeCounter/3*300)
                 + (fourCounter/3*400) + (fiveCounter%3*50)
                 + (fiveCounter/3*500) + (sixCounter/3*600);
      return score;
   }
}
