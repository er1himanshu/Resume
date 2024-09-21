public class From_array {
    public static void main(String[] args){

        /* 
        Java Arr ays
        Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        
        To declare an array, define the variable type with square brackets:-       String[] cars;                        */
        
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};   // declare variable 


// creating  array  of Integers
int[] myNum = {10, 20, 30, 40};
System.out.println(myNum[0]);  // This will print 10

/*
Loop Through an Array
You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

The following example outputs all elements in the cars array:

Example :-                                     */
String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
for (int p = 0; p < car.length; p++) {
  System.out.println(car[p]);
}

// ex using While
int i = 0; 
while (i < myNum.length) {  
    System.out.println(myNum[i]); 
    i++;  
}



// create a program that calculates the average of different ages

int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
float avg, sum = 0;
int length = ages.length;
// Loop through the elements of the array
for (int age : ages) {
  sum += age;
}
avg = sum / length;
System.out.println("The average age is: " + avg);


/*
Multidimensional Arrays :-
A multidimensional array is an array of arrays.
Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.
To create a two-dimensional array, add each array within its own set of curly braces:

Example :                            */
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
System.out.println(myNumbers[1][2]);    // accessing element of row'1'  and  column'2'
myNumbers[1][2] = 9;    // changing array Element
System.out.println(myNumbers[1][2]); 
 
/*
Loop Through a Multi-Dimensional Array
You can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to 
point to the two indexes):

Example
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
for (int i = 0; i < myNumbers.length; ++i) {
  for (int j = 0; j < myNumbers[i].length; ++j) {
    System.out.println(myNumbers[i][j]);
  }
}

Or you could just use a for-each loop, which is considered easier to read and write:

Example
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
for (int[] row : myNumbers) {
  for (int i : row) {
    System.out.println(i);
  }
}

 */








    } 
} 