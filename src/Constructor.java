import java.util.Scanner;
public class Constructor {

    String name = "Mavis";
    int age = 4;


    //This is a constructor that I am calling on line 41 in Main.java
    public static void myDog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type dog name: ");
        String dogName = scanner.nextLine();
        System.out.println("type dog age: ");
        int dogAge = scanner.nextInt();
        System.out.println(dogName + " is a good boy " + "and he is " + dogAge);
    }

}
