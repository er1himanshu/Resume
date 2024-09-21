/*Java Methods/Functions :-
1. Methods are used to perform certain actions, and they are also known as functions.
2. A method is a block of code which only runs when it is called.
3. You can pass data, known as parameters, into a method.
4. Why use methods? To reuse code: define the code once, and use it many times. 

Create a method inside Main : -

public class Method {                       <--- here aslo note class name will be same as file name
  static void myMethod() {                  <--- myMethod() is the name of the method
    // code to be executed
  }
}

-static means that the method belongs to the Main class and not an object of the Main class. 
-void means that this method does not have a return value.

*/

//  how to add diffrenbt function inside java 
public class Method {
    // First method withou parameter
    static void myMethod() {
      System.out.println("I just got executed!");
    }

    // New method (Second method with a parameter)
    static void anotherMethod(String fname) {  // Parameter 'fname' is defined here
      System.out.println(fname + " Soni");
    }

    static void checkAge(int x){
      if(x < 18){
        System.out.println("You Cant Cast Vote");
      }
      else{
        System.out.println("You Can Cast Vote");
      }
    }
    //3rd method/function
    public static void main(String[] args) {
      myMethod();  // Calling the first method (no parameters or arguments)

      // Calling the second method with arguments
      anotherMethod("Himanshu");  // Argument "Himanshu" is passed to the parameter 'fname'
      anotherMethod("Harsh");     // Argument "Harsh" is passed to the parameter 'fname'
      anotherMethod("Lalu");      // Argument "Lalu" is passed to the parameter 'fname'
      myMethod();  // Calling the first method again\
      checkAge(2);
      checkAge(22);


// When a parameter is passed to the method, it is called an argument. So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments. 























    }
}


public class Main {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}
// Outputs 8 (5 + 3)



 