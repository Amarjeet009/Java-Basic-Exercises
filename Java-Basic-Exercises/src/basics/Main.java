package basics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PositiveNegativeZero zero = new PositiveNegativeZero();
        zero.checkNumber(1);
        zero.checkNumber(-1);
        zero.checkNumber(0);

        SpeedConverter speed = new SpeedConverter();
        speed.printConversion(10);

        MegaBytesConverter megabyte= new MegaBytesConverter();
        megabyte.printMegaBytesAndKiloBytes(100);

        LeapYear leapYear = new LeapYear();
       boolean isLeapYear= leapYear.isLeapYear(2024);
        System.out.println("Is Leap Year | " + isLeapYear);

        BarkingDog barkingDog = new BarkingDog();
        boolean isBarkingDog =  barkingDog.shouldWakeUp(true, 5);
        System.out.println("Is Barking Dog | " + isBarkingDog);

        DecimalComparator decimalComparator = new DecimalComparator();
        boolean isDecimalComparator = decimalComparator.areEqualByThreeDecimalPlaces(2203.33,4455.566);
        System.out.println("Is Decimal Comparator | " + isDecimalComparator);

        EqualSumChecker equalSumChecker = new EqualSumChecker();
        boolean isEqualSumChecker = equalSumChecker.hasEqualSum(222,444,6644);
        System.out.println("Is Equal Sum Checker | " + isEqualSumChecker);


    }
}