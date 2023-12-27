public class Array {
    public static void main(String[] args) {

        // arrays store multiple values within a variable
        // values have to be the same data type
/*
        // one way to create an array
        String[] chips = {"doritos", "fries", "lays"};

        // additional way to create an array
        String[] cookies = new String[5];
        cookies[0] = "Sugar";
        cookies[1] = "Choco";
        cookies[2] = "PeanutButter";
        cookies[3] = "Oatmeal";
        cookies[4] = "Strawberry";

        // for loop iterates through the array spitting out each value until it hits the .length of the array
        for(int i=0;i <cookies.length; i++){
            System.out.println(cookies[i]);
        }
*/

        // 2D Array is an array of arrays

        String[][] cars = new String[3][3];

        cars[0][0] = "xb";
        cars[0][1] = "yd";
        cars[0][2] = "4z";
        cars[1][0] = "ga";
        cars[1][1] = "ho";
        cars[1][2] = "jq";
        cars[2][0] = "kw";
        cars[2][1] = "em";
        cars[2][2] = "rm";


        for (int i = 0; i < cars.length; i++) {
            System.out.println(i);
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[j][i] + " ");

            }
        }


    }

}