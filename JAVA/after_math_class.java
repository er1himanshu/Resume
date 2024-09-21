public class after_math_class{
    public static void  main(String[] args){

        // Math.abs(x)
        // The Math.abs(x) method returns the absolute (positive) value of x:
        
        // Example
        int data = (int) Math.abs(-4.7);
        System.out.println(data);

        // and using double :-
        double data2 = Math.abs(-4.7);  // Correct way for double
        System.out.println(data2);  // Output: 4.7
                


        /*Random Numbers
        Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        
        Example
        Math.random();
        
        To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula:
        
        Example  */
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);


// checking comparision operator  >=
int myAge = 25;
int votingAge = 18;
System.out.println(myAge >= votingAge);


// ex 2

int Age = 25;
int votingAges = 18;
if (Age >= votingAges) {
  System.out.println("Old enough to vote!");
} else {
  System.out.println("Not old enough to vote.");
}



/*
 Java Else If
The else if Statement
Use the else if statement to specify a new condition if the first condition is false.

Syntax :-
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
 */


/*
Short Hand if...else  (Ternary Operator)
There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

Syntax :-
variable = (condition) ? expressionTrue :  expressionFalse;
 */
// ex :-
int time = 20;
String result = (time > 15) ? "Too Late" : "Come here" ;
System.out.println(result);


/*
Java Switch Statements
Instead of writing many if..else statements, you can use the switch statement.

The switch statement selects one of many code blocks to be executed    
switch(expression) {
    case x:
      // code block
      break;
    case y:
      // code block
      break;
    default:
      // code block

  }             
      
The break Keyword :- 
When Java reaches a break keyword, it breaks out of the switch block.

This will stop the execution of more code and case testing inside the block.

When a match is found, and the job is done, it's time for a break. There is no need for more testing.           */
// ex :-

int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)


/*
Java While Loop
The while loop loops through a block of code as long as a specified condition is true:

Syntax :-
while (condition) {
  // code block to be executed
}
*/
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}


/*
The Do/While Loop
The do/while loop is a variant of the while loop. This loop will execute the code block once, 
before checking if the condition is true, then it will repeat the loop as long as the condition is true.

do/while loop. The loop will always be executed at least once, even if the condition is false, 
because the code block is executed before the condition is tested

Syntax :-
do {
  // code block to be executed
}
while (condition);
*/
int k = 0;
do {
  System.out.println(i);
  k++;
}
while (k < 5);


// ex 

int countdown = 3;

while (countdown > 0) {
  System.out.println(countdown);
  countdown--;
}

System.out.println("Happy New Year!!");


/* 
Java For Loop
When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

Syntax :-
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}


Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.

The example below will print the numbers 0 to 4:                                     */
// ex :-
for (int d = 0; d < 5; d++) {
    System.out.println(d);
  }

/*
  Nested Loops
  It is also possible to place a loop inside another loop. This is called a nested loop.
  
  The "inner loop" will be executed one time for each iteration of the "outer loop":
  
  Example :-          */
  // Outer loop
  for (int h = 1; h <= 2; h++) {
    System.out.println("Outer: " + h); // Executes 2 times
    
    // Inner loop
    for (int j = 1; j <= 3; j++) {
      System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
    }
  } 
  
  /*
For-Each Loop
There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data sets):

Syntax :- 
for (type variableName : arrayName) {
  // code block to be executed
}                                      */


String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String l : cars) {
  System.out.println(l);
}

// create a program that only print even values between 0 and 10:
// Example
for(int c = 0; c <= 10; c = c + 2){
  System.out.println(c);
}






























    }
}