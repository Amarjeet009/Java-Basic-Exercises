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
        leapYear.isLeapYear(2024);

        BarkingDog barkingDog = new BarkingDog();
        barkingDog.shouldWakeUp(true, 5);

        DecimalComparator decimalComparator = new DecimalComparator();
        decimalComparator.areEqualByThreeDecimalPlaces(2203.33,4455.566);

        EqualSumChecker equalSumChecker = new EqualSumChecker();
        equalSumChecker.hasEqualSum(222,444,6644);


    }
}