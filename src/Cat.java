public class Cat {

    String name;
    int age;

    public static void lucy() {
        System.out.println("Good Kitty");
    }

    //can't call a nonstatic method
    public void kitty() {
        System.out.println("Good Kitty");
    }
}
