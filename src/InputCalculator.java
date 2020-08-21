import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner userInput = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int counter = 0;

        while(true){
//            System.out.print("Enter Number: ");
            if (!userInput.hasNextInt()) break;
            counter++;
            sum += userInput.nextInt();
            userInput.nextLine();
        }
        if (counter != 0){
            average =  Math.round((double) sum / (double) counter);
        } else {
            average = 0;
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        userInput.close();
    }
}
