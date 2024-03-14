package overloading;

/******************************************************
 * methods having same name but different in parameters, it is known as Method Overloading
 ********************************************************/
public class MethodOverloadingExample1 {

    public  static  int calculateValues(int firstvalue, int secondvalue) {
        System.out.println("First Value | " + firstvalue + "  Second Value | " + secondvalue);
        int total = firstvalue + secondvalue;
        return  total;
    }

    public  static  double calculateValues(double firstvalue, double secondvalue) {
        System.out.println("First Value | " + firstvalue + "  Second Value | " + secondvalue);
        double total = firstvalue + secondvalue;
        return  total;
    }

    public  static double calculateValues(double firstvalue, double secondvalue, double thirdValue) {
        System.out.println("First Value | " + firstvalue + "  Second Value | " + secondvalue + " Third Value | "+ thirdValue);
        double total = firstvalue + secondvalue + thirdValue;
        return total;
    }

    public  static float calculateValues(float firstvalue, float secondvalue, float thirdValue) {
        System.out.println("First Value | " + firstvalue + "  Second Value | " + secondvalue + " Third Value | "+ thirdValue);
        float total = firstvalue + secondvalue + thirdValue;
        return total;
    }
}
