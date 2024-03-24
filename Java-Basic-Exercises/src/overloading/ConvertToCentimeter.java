package overloading;

/******************************************************
 * methods having same name but different in parameters, it is known as Method Overloading
 ********************************************************/

/**
 * @author Amarjeet Rao
 */
public class ConvertToCentimeter {

    public static double convertToCentimeter(int inches) {
        return  inches * 2.54;
    }

    public static double convertToCentimeter(int feet,int inches) {
        int feetToInch = feet*12;
        int totalInches = feetToInch + inches;
        double result = convertToCentimeter(totalInches);
        return  result;
    }


}
