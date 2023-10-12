# Problem 1
Determine the number of occurrences of the string s2 in the string s1 using the following methods:

substring method
indexOf method
Example:

String s1 = "si";
String s = "sir1 si cu sir2 fac un sir3";
Result: 4.


# Problem 2
Write a method that takes as arguments a string s1 and a word s2. The method returns the number of occurrences of word s2 in the string s1. Consider the following situations:

Use the split method of the String class, with a space character as the word delimiter.
Use the StringTokenizer class with separators being :, ,, ., -, ?, space, and newline characters.
Example 1:
In the text "sir1 si sir2 sunt 2 siruri," the method should return 0 if searching for "sir" and 1 if searching for "sir2."

Example 2:
In the text "Marius, why didn't you help George? It was your duty to see what you can do," the word "ce" appears twice, and "l" appears only once.

# Problem 3
Generate a Vector object containing 20 random integers from the interval [0..10] using the nextInt method.

Write a method that takes as parameters a Vector object generated previously and an integer x. The function will remove each occurrence of x from the vector and return the number of occurrences of x. Test the implemented method.

Write a main method where, for the previously generated vector, you determine the maximum component value, the position of the minimum component, and the arithmetic mean of the vector's elements. Use methods from the Vector class for the required operations.

# Problem 4
Implement a class containing the main method with two Vector objects representing two sets of integers. Assuming there are no duplicate elements, perform the basic set operations: union, intersection, and difference between the first set and the second.

For testing, introduce a minimum of ten elements into the vectors. Use a Vector object to retain the results for each set operation.

# Problem 5
Implement a class named Problem5 that, in addition to the main method, contains a method that receives two arguments: a constant string and a vector of words (strings).

If the text contains at least one occurrence of a word from the vector passed as a parameter, it will display the message "Text suspect"; otherwise, it will display "Nothing suspect."

The method will return a string in which each occurrence of a word from the vector of words is censored. For example, occurrences of the word "terrorist" will be replaced with "t* * * * * *t."

Example:
e
String text = "A terrorist had a bomb";
String[] words = new String[2];
words[0] = "terrorist";
words[1] = "bomb";
Problem5 prb5 = new Problem5();
String result;
result = prb5.censor(text, words);
Problem 6
Create a class that, in the main method, contains a Vector object in which various types of objects are introduced (int, double, float, String, char, boolean). For each type, determine how many elements of that type exist in the vector and store the number of occurrences in a second vector.

Example:

Vector v = new Vector();
v.add(7.5);
v.add("String");
System.out.println(v.get(0).getClass());
System.out.println(v.get(1).getClass());