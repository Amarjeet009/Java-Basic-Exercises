public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PositiveNegativeZero zero = new PositiveNegativeZero();
        zero.checkNumber(1);
        zero.checkNumber(-1);
        zero.checkNumber(0);

        SpeedConverter speed = new SpeedConverter();
        speed.printConversion(10);


    }
}