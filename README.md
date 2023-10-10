# Java

# Problem 1

Enter the program below (the Test class) into a file named Prob1.java using the integrated environment NetBeans / Eclipse.

Compile and run the following program:



class Test {
    public static void main(String args[]) {
        System.out.println("Test Java");
    }
}


Add the 'public' attribute before the 'class' keyword, recompile, and execute the program. Solve the problem that arises!



IMPORTANT!
Classes that do NOT have the 'public' attribute can have a different name than the source file, but if we add the 'public' attribute, it is mandatory for the class name and the name of the source file containing the class to coincide.

# Problem 2

Write a Problema2 class that contains two methods (functions):

A non-static method 'print' that receives a String argument and displays it.
A 'main' method that calls the 'print()' function to display a constant string.
IMPORTANT!
The 'print' method will be called in 'main' as follows:

Problema2 object = new Problema2(); // create a Problema2 object
object.print("Test"); // call the print method


# Problem 3

Modify the class written in the previous exercise by defining two classes, each containing one method:

A class for the 'main' method.
A class for the 'print' method.
Check if both classes in the file can be public. Call the 'print' method in the same way as in Problem 2!

Modifying the previous program by creating two source files, each containing one of the above classes. Try to execute both classes.

IMPORTANT!
Two public classes cannot be defined in one file.

# Problem 4

Write a program to display all the arguments received on the command line.

Note:
Arguments can be passed as follows:

If the program is run from NetBeans / Eclipse, follow the instructions at the beginning of the lab.
If the program is run from the command line: 'java programname arg1 arg2 arg3'



# Problem 5

Create a class that includes a recursive (non-static) method for calculating the integer power of an integer and a method for displaying the result of the function, along with the result of the static 'Math.pow(base, exp)' function for validation. The class will contain a 'main' method in which the two previously defined methods will be tested.

IMPORTANT!
A static method of a class is called as:

ClassName.staticMethodName(...)
For example: 'Math.pow(...)'

# Problem 6

Implement a class with two methods:

A non-static boolean method that checks if a given integer is prime.
A 'main' method that checks the previous method for all natural numbers less than 20.



# Problem 7

Write a program to verify Goldbach's conjecture for the first n even numbers, by displaying all sums of two prime numbers through which an even number can be expressed. The variable n can be initialized with a constant value.

Goldbach's Conjecture: Any even number can be decomposed as the sum of at least one pair of two prime numbers. Consider 1 as a prime number.

To display an expression of the form a = b + c, write:

System.out.println(a + " = " + b + " + " + c);
Where a, b, and c are numeric variables of any type (short, int, long, float, double).

# Problem 8

Write a program to sort an array of numbers and perform binary search in this array using the static methods 'sort()' and 'binarySearch()' from the Arrays class. The array will contain randomly generated numbers using the 'random()' static method from the Math class, with a result of type double.
