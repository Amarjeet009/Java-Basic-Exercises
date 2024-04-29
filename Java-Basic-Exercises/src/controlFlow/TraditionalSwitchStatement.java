package controlFlow;

public class TraditionalSwitchStatement {

    public static void getNumber(int number){
        switch(number) {
            case 1:
                System.out.println(" The value is 1");
                break;
            case 2:
                System.out.println(" The value is 2");
                break;
            case 3:
                System.out.println(" The value is 3");
                break;
            case 4 : case 5: case 6:
                System.out.println(" The value is " + number);
                break;
            default:
                System.out.println("It was not in range of 1-6, it's " + number);

        }

    }


}
