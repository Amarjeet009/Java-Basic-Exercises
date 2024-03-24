package overloading;

/******************************************************
 * methods having same name but different in parameters, it is known as Method Overloading
 ********************************************************/

/**
 * @author Amarjeet Rao
 */
public class DurationValidation {

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds
                    + "), must be a positive integer value";
        }
        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes
                    + "), must be a positive integer value";
        }
        if (seconds <= 0 || seconds >= 59) {
            return "Invalid data for seconds(" + seconds
                    + "), must be between 0 and 59";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

}
