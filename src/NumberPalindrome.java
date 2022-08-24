public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

       number=Math.abs(number);
      int givenNumber=number;
        int reverseNumber = 0;
        while (number > 0) {
            int reverse = number % 10;
            reverseNumber = (reverseNumber * 10) + reverse;
            number /= 10;
        }

        if (givenNumber == reverseNumber)
            return true;
        else
            return false;
    }
}

