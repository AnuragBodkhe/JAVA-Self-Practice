package ConditionalStatements;

public class SwitchCases2 {
    public static void main(String[] args){
        int coffee = 1;
        int tea = 2;
        int water = 3;

        switch(water){
            case 1:
                System.out.println("ordered coffee");
            break;
            case 2:
                System.out.println("ordered Tea");
            break;
            case 3:
                System.out.println("ordered Water");
            break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
