public class NestedLoops {
    public static void main(String[] args) {

        //runs once then goes to second for loop
        for(int i=0; i <= 10; i++){
            System.out.println("X");
            // runs until it hits the targeted variable then goes back to first for loop
            for (int j=1; j <= 5; j++) {
                System.out.print("O");
            }
        }
    }
}
