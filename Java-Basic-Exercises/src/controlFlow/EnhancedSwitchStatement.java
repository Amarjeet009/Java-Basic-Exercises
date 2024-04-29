package controlFlow;

public class EnhancedSwitchStatement {

    public static  void getNumber(int number){

        switch (number){
            case 1-> System.out.println("The Enhanced value is 1");
            case 2-> System.out.println("The Enhanced value is 2");
            case 3-> System.out.println("The Enhanced value is 3");
            case 4,5,6-> {
                System.out.println("The Enhanced value is 4,5 or 6");
                System.out.println("Actually it is " + number);
            }
            default -> System.out.println("It was not in range of 1-6");


        }
    }
}
