package controlFlow;

public class NumberOfDaysInMonth {
    public static void getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 0 || year > 9999) {
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return;
                case 4:
                case 6:
                case 9:
                case 11:
                    return;
                default:
                    if (isLeapYear(year)) {
                    } else {
                    }



            }
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}