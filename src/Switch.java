public class Switch {
    public static void main(String[] args) {

        // switch - a statement that allows a variable to be tested for equality against a list of values
        // switches can work with byte short char int and Strings

        String day = "Friday";

        switch(day) {
            case "Sunday" :
                System.out.println("its Sunday");
                break;
            case "Monday" :
                System.out.println("its Monday");
                break;
            case "Tuesday" :
                System.out.println("its Tuesday");
                break;
            case "Wednesday" :
                System.out.println("its Wednesday");
                break;
            case "Thursday" :
                System.out.println("its Thursday");
                break;
            case "Friday" :
                System.out.println("its Friday");
                break;
            case "Saturday" :
                System.out.println("its Saturday");
                break;
            default:
                System.out.println("not a day");
        }


    }
}
