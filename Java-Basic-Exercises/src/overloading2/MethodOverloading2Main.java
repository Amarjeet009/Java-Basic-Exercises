package overloading2;

public class MethodOverloading2Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        double area1 = areaCalculator.area(100);
        System.out.println("Area 1 " + area1);

        double area2 = areaCalculator.area(120.43, 454.0);
        System.out.println("Area 2 " + area2);

        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);

        IntEqualityPrinter.printEqual(1, 1, 1);
        IntEqualityPrinter.printEqual(1, 1, 2);
        IntEqualityPrinter.printEqual(-1, -1, -1);
        IntEqualityPrinter.printEqual(1, 2, 3);

        PlayingCat playingCat = new PlayingCat();

        boolean playingCat1 = playingCat.isCatPlaying(true, 10);
        System.out.println("playingCat 1 | " + playingCat1);
        boolean playingCat2 = playingCat.isCatPlaying(false, 36);
        System.out.println("playingCat 2 | " + playingCat2);
        boolean playingCat3 = playingCat.isCatPlaying(false, 35);
        System.out.println("playingCat 2 | " + playingCat2);

    }
}
