package overloading;

/******************************************************
 * methods having same name but different in parameters, it is known as Method Overloading
 ********************************************************/

/**
 * @author Amarjeet Rao
 */
public class Duration {

    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

}
