package controlFlow;

public class ControlFlowMain {
    public static void main(String[] args) {
        TraditionalSwitchStatement.getNumber(5);
        EnhancedSwitchStatement.getNumber(9);
        NumberInWord.printNumberInWord(4);
        NumberOfDaysInMonth.getDaysInMonth(3,2021);

        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));

        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit ( 252) );

        System.out.println(EvenDigitSum.getEvenDigitSum(252));

        SharedDigit.hasSharedDigit(21,33);
        LastDigitChecker.hasSameLastDigit(12,33,44);
        FactorPrinter.printFactors(21);

        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.reverse(1234));

    }
}
