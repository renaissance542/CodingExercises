public class NumberToWords {
    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        } else {
            int digit = 0;
            int digitCounter = 0;
            for (int n = reverse(number); n > 0; n /= 10) {
                digitCounter++;
                digit = n % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Digit");
                        break;
                }
            }
            while (digitCounter < getDigitCount(number)) {
                System.out.println("Zero");
                digitCounter++;
            }
        }
    }

    public static int reverse (int number){
        int reversedNumber = 0;
        for (int n = number; n != 0; n /= 10){
            reversedNumber *= 10;
            reversedNumber += n % 10;
        }

        if ((number < 0) && (reversedNumber > 0)){
            return reversedNumber * -1;
        } else {
            return reversedNumber;
        }

    }

    public static int getDigitCount (int number){
        if (number < 0) return -1;
        if (number == 0) return 1;
        int digitCount = 0;
        for (int n = number; n > 0; n /=10){
            digitCount++;
        }
        return digitCount;
    }
}
