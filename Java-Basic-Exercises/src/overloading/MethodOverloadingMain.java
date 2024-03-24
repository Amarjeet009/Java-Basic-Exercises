package overloading;

/**************************************
 * OVERLOADING
 * Method have same name but different parameter and different return datatype
 *
 *************************************/
public class MethodOverloadingMain {

    public static void main(String[] args) {
        System.out.println("Method Overloading calling");

        ClculateValues _calculateScore = new ClculateValues();

        int newScore = _calculateScore.calculateValues(100, 320);
        System.out.println("New Score | "+ newScore);

        double newScore1 = _calculateScore.calculateValues(10.50, 50.50);
        System.out.println("New Score 1 | "+ newScore1);

        double newScore2 =  _calculateScore.calculateValues(23.22,23.23, 33.43);
        System.out.println("New Score 2 | "+ newScore2);

        float newScore3 =  _calculateScore.calculateValues(2434.22f,2355.23f, 3443.43f);
        System.out.println("New Score 3 | "+ newScore3);

        ConvertToCentimeter centimeter = new ConvertToCentimeter();
        double _centimeter1 = centimeter.convertToCentimeter(3);
        System.out.println("_centimeter1 | " + _centimeter1);

        double _centimeter2 = centimeter.convertToCentimeter(30, 3);
        System.out.println("_centimeter2 | " + _centimeter2);

        Duration duration = new Duration();
        String _duration1 = duration.getDurationString(3945);
        System.out.println("_Duration 1 | "+ _duration1);
        String _duration2 = duration.getDurationString(65,45);
        System.out.println("_Duration 2 | "+ _duration2);

        DurationValidation durationValidation = new DurationValidation();

        String _duration3 = durationValidation.getDurationString(65, 145);
        System.out.println("_Duration 3 | "+ _duration3);
        String _duration4 = durationValidation.getDurationString(65,45);
        System.out.println("_Duration 4 | "+ _duration4);

        String _duration5 = durationValidation.getDurationString(3945);
        System.out.println("_Duration 5 | "+ _duration5);

    }
}
