public class Main {
    /* Method Declaration
     the main method is the start
     "public static void" is the three reserved keywords
     "main" is the name of the method
     String[] is the reference type
     args [] variable name
    */
    public static void main(String[] x) {

        // type of variable + name of variable = variable
        // primitive types start with lowercase
        // you can't call a method on a primitive variable
        int myInt = 7;
      double myDecimal = 9.9;
      char myX = 'X';
      boolean myTrue = true;

      String myName = "Xavier";
      if(myName == "Xavier"){
          System.out.println("nice");
      } else System.out.println("bad");

      // for loop
      for (int i = 0;i < myInt; i++){
          System.out.println(i);
      }

      // prints above variable
        System.out.println(myInt);

      // calling a method from class Cat
        Cat.lucy();

        Cat myCat = new Cat();
        myCat.age = 2;
        myCat.name = "Lucy";
        System.out.println(myCat.age);


        Constructor.myDog();
    }
}