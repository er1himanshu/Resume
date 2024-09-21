public class First_code {
  public static void main(String[] args) {
      /* The code below will print the words Hello World
to the screen, and it is amazing */
      System.out.println("Hello World! ");  // printing string/text need  ""
      System.out.println(50000);                     // printing numbers don't needs  ""
      System.out.println(3 + 3);                    // we can do airthmatic operations too
      System.out.println(2 * 5);

      System.out.print("using print insted of println. ");
      System.out.print("all content will print on the same line");
      System.out.println(".");

      
/*Declaring (Creating) Variables
To create a variable, you must specify the type and assign it a value:

Syntax :-
type variableName = value;     */

String name = "Himanshu";
System.out.println(name);


/*Final Variables :-
If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only): */

// without Final :-

int age = 24 ;
age = 25;
System.out.println(age);

// with final :-

// final int money = 100;
// int money = 200;      // give error: variable money is already defined in method main(String[])
// System.out.println(money);


/*Display Variables
The println() method is often used to display variables.

To combine both text and a variable, use the + character: */

String name2 = "Himanshu";
String lastName = "Soni";
System.out.println("Hello " + name2);
System.out.println(name2 +" " +  lastName);
// You can also use the concat() method to concatenate two strings:
System.out.println(name2.concat(lastName));


//float and double data type

float marks = 10.5f;
System.out.println("markss" + marks);

double myNum = 19.99d;
System.out.println(myNum);

/*
Scientific Numbers
A floating point number can also be a scientific number with an "e" to indicate the power of 10:

Example */
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);


// boolean DataType

boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false



/*
 Non-Primitive Data Types
Non-primitive data types are called reference types because they refer to objects.

The main difference between primitive and non-primitive data types are:--

1. Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
2. Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
3. A primitive type always has a value, while non-primitive types can be null.
4. A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
 */



 /*
  Java Type Casting
Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

1.  Widening Casting (automatically) - Widening casting is done automatically when passing a smaller size type to a larger size type:
converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

2.  Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

  */

// 1.  Widening Casting (automatically) :- ex:-
int x = 22;
double y = x;

System.out.println(x);  // Outputs 22
System.out.println(y);  // Outputs 22.0


// 2. Narrowing Casting : Narrowing casting must be done manually by placing the type in parentheses () in front of the value:

double myDouble = 9.78d;
int myInt = (int) myDouble; // Manual casting: double to int

System.out.println(myDouble);   // Outputs 9.78
System.out.println(myInt);      // Outputs 9

// Exampple : 
// Set the maximum possible score in the game to 500
int maxScore = 500;

// The actual score of the user
int userScore = 423;

/* Calculate the percantage of the user's score in relation to the maximum available score.
Convert userScore to float to make sure that the division is accurate */
float percentage = (float) userScore / maxScore * 100.0f;

System.out.println("User's percentage is " + percentage);




//  length, uppercase of string
String s = "Himanshu";
System.out.println("length is "+ s.length());
System.out.println(s.toUpperCase()); 

/*
  Finding a Character in a String
The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
and  return '-1'  if string not prasent 
 */

 // Example :-
 String txt = "Please locate where 'locate' occurs!";
 System.out.println(txt.indexOf("locate")); // Outputs 7
 System.out.println(txt.indexOf("occurs!"));
 System.out.println(txt.indexOf("Lol"));  // Outputs -1 , bcz Lol not in string



//  Strings - Special Characters
//  Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
 //  String txt = "We are the so-called "Vikings" from the north.";
//  The solution to avoid this problem, is to use the backslash escape character.
 
//  The backslash (\) escape character turns special characters into string characters:
 
//  Escape character	Result	Description
//  \'	'	Single quote
//  \"	"	Double quote
//  \\	\	Backslash
//  The sequence \"  inserts a double quote in a string:

String data = "We are the so-called \"Vikings\" from the north.";
System.out.println(data);

// The sequence \\  inserts a single backslash in a string:
// Example
String data2 = "The character \\ is called backslash.";
System.out.println(data2);


/* 
Other common escape sequences that are valid in Java are:

Code	    Result	
\n	    New Line	
\r	    Carriage Return	
\t	    Tab	
\b	    Backspace	
\f	    Form Feed	                  */

    String txt2 = "Hello\nWorld!";
    System.out.println(txt2);


  }
}
