//import jdk.internal.joptsimple.internal.Strings;

public class Main {

    public static void main(String[] args) {
        System.out.println(CarMileage.isInteresting(11209, new int[]{1337, 256}));
//        System.out.println(KataBigIntFactorial.Factorial(169));
//        String combinationTest = "10";
//        System.out.println(ObservedPin.getPINs(combinationTest).toString());
//        List<String> singlePermutations = Permutations.singlePermutations("abbcdc");
//        System.out.println(singlePermutations.toString());

    }
    static String toCamelCase (String stringToFix){
        if (stringToFix.isEmpty()){
            return "";
        }
        String camelCased = "" + stringToFix.charAt(0);
        stringToFix = stringToFix.toLowerCase();

        boolean toUpperCase = false;
        for (int i = 1; i<stringToFix.length(); i++){
            String currentCharacter = "" + stringToFix.charAt(i);
            if (currentCharacter.equals("_") || currentCharacter.equals("-")){
                toUpperCase = true;
                continue;
            } else {
                if (toUpperCase){
                    camelCased += currentCharacter.toUpperCase();
                } else {
                    camelCased += currentCharacter;
                }
                toUpperCase = false;
            }
        }
        return camelCased;
    }
    static String spinWords(String sentence){
        String newSentence ="";
        String[] words = sentence.split(" ");
        for(int i = 0; i<words.length;i++){
            if (words[i].length()<5){
                newSentence += words[i];
            } else {
                for (int j=words[i].length()-1; j>=0; j--){
                    newSentence += "" + words[i].charAt(j);
                }
            }
            if (i+1<words.length){
                newSentence +=" ";
            }
        }
        return newSentence;
    }
}
