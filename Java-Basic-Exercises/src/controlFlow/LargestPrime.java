package controlFlow;

public class LargestPrime {
     public static final int INVALID_MESSAGE = -1;

    public static int getLargestPrime(int number) {
        if (number <= 0) {
            return INVALID_MESSAGE;
        }
        int maxPrime = -1;
        while (number % 2 == 0) {
            maxPrime = 2;
            number >>= 1;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                maxPrime = i;
                number /= i;
            }
        }
        if (number > 2) {
            maxPrime = number;
        }
        return maxPrime;


    }
}