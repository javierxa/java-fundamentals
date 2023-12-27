import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        logical operators - use to connect two or more expressions

                            && = (AND) both conditions must be true
                            || = (OR) either condition must be true
                            ! = (NOT) reverse boolean value of a condition
         */

        System.out.println("What is your age and weight?");
        int age = scanner.nextInt();
        int weight = scanner.nextInt();


        
        if(age > 18 && weight > 150){
            System.out.println("you a man.");
        } else if (age > 18 || weight > 150) {
            System.out.println("you a teen.");
        } else System.out.println(!(age == 0));;
    }
}
