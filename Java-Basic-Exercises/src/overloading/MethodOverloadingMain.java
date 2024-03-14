package overloading;

/**************************************
 * OVERLOADING
 * Method have same name but different parameter and different return datatype
 *
 *************************************/
public class MethodOverloadingMain {

    public static void main(String[] args) {
        System.out.println("Method Overloading calling");

        MethodOverloadingExample1 _calculateScore = new MethodOverloadingExample1();

        int newScore = _calculateScore.calculateValues(100, 320);
        System.out.println("New Score | "+ newScore);

        double newScore1 = _calculateScore.calculateValues(10.50, 50.50);
        System.out.println("New Score 1 | "+ newScore1);

        double newScore2 =  _calculateScore.calculateValues(23.22,23.23, 33.43);
        System.out.println("New Score 2 | "+ newScore2);

        float newScore3 =  _calculateScore.calculateValues(2434.22f,2355.23f, 3443.43f);
        System.out.println("New Score 3 | "+ newScore3);

        MethodOverloadingExample2 centimeter = new MethodOverloadingExample2();
        double _centimeter1 = centimeter.convertToCentimeter(3);
        System.out.println("_centimeter1 | " + _centimeter1);

        double _centimeter2 = centimeter.convertToCentimeter(30, 3);
        System.out.println("_centimeter2 | " + _centimeter2);

    }
}
