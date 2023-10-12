public class StringMethods {
    public static void main(String[] args){
        Method areTheyEqual = new Method("I am a string","I am a string");
        areTheyEqual.checkIfEqual();// true
        new Method("I AM A STRING", "i am a string").checkIfEqualIgnoreCase();// true
        new Method("I am a string", "I am a string").checkIfEqualUsingCompareTo();// 0
        new Method("I AM A STRING", "I am a string").checkIfEqualUsingCompareToIgnoreCase();// 0
        new Method("I am a string", "I am").functionToCheckIfStringStartsWith();// true
        new Method("I am a string", "string").functionToCheckIfStringEndsWith();// true
        new Method("I am a string", "a").functionToCheckIfStringContains();// true
        new Method("I am a string", "").functionToCheckIfStringIsEmpty();// false
        new Method("I am a string", "").functionToCheckIfStringIsBlank();// false
        new Method("I am a string", "").functionToCheckIfStringIsNumeric();// I am a string
        new Method("I am a string", "I am not string ").functionToReplace();// I am a string
        new Method("I am a string", "I don't get this ").functionToReplaceAll();// I am a string
        new Method("I am a string", "hello ").functionToReplaceFirst();// I am a string
        new Method("I am a string", "does this split ").functionToSplit();// I am a string
        new Method("I am a string", "I am a string").functionToSplitWithLimit();// I am a string
     //   new Method("I am a string", "I am a string").functionToSplitWithLimitAndNegativeValue();// I am a string
        new Method("I am a string", "I AM OTHER ").functionToConcat();// I am a string
        // and all the other methods

    }
}

class Method{
    private String str1;
    private String str2;
    Method(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }
    void checkIfEqual(){
        // equals() method compares the original content of the string
        System.out.println(str1.equals(str2));
    }
    void checkIfEqualIgnoreCase(){
        // equalsIgnoreCase() method compares the original content of the string ignoring the case
        System.out.println(str1.equalsIgnoreCase(str2));
    }
    void checkIfEqualUsingCompareTo(){
        // compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
        System.out.println(str1.compareTo(str2));
    }
    void checkIfEqualUsingCompareToIgnoreCase(){
        // compareToIgnoreCase() method compares two strings lexicographically, ignoring case differences.
        System.out.println(str1.compareToIgnoreCase(str2));
    }
    void functionToCheckIfStringStartsWith(){
        // startsWith() method checks if this string starts with given prefix.
        System.out.println(str1.startsWith("I"));
    }
    void functionToCheckIfStringEndsWith(){
        // endsWith() method checks if this string ends with given suffix.
        System.out.println(str1.endsWith(str2));
    }
    void functionToCheckIfStringContains(){
        // contains() method searches the sequence of characters in this string.
        System.out.println(str1.contains(str2));
    }
    void functionToCheckIfStringIsEmpty(){
        // isEmpty() method checks if this string is empty.
        System.out.println(str1.isEmpty());
    }
    void functionToCheckIfStringIsBlank(){
        // isBlank() method checks if this string is empty or contains only white space codepoints.
        System.out.println(str1.isBlank());
    }
    void functionToCheckIfStringIsNumeric(){
        // intern() method returns the canonical representation for the string object.
        System.out.println(str1.intern());
    }
    // replace() method replaces all occurrences of old char with new char and returns a new string.
    void functionToReplace(){
        System.out.println(str1.replace(str1,str2));
    }

// replaceAll() method replaces each substring of this string that matches the given regular expression with the given replacement.
    void functionToReplaceAll(){
        System.out.println(str1.replaceAll(str1,str2));
    }
    // replaceFirst() method replaces the first occurrence of given regular expression with new replacement.
    void functionToReplaceFirst(){
        System.out.println(str1.replaceFirst(str1,str2));
    }
    // substring() method returns a new string which is the substring of the given string.
    void functionToSubstring(){
        System.out.println(str1.substring(0,5));
    }
    // concat() method concatenates the specified string to the end of current string.
    void functionToConcat(){
        System.out.println(str1.concat(str2));
    }
    // trim() method eliminates leading and trailing spaces.
    void functionToTrim(){
        System.out.println(str1.trim());
    }
    // contains() method searches the sequence of characters in this string.
    void functionToContains(){
        System.out.println(str1.contains(str2));
    }

    // indexOf() method returns the index of given character value or substring.
    void functionToIndexOf(){
        System.out.println(str1.indexOf(str2));
    }
    // lastIndexOf() method returns the last index of given character value or substring.
    void functionToLastIndexOf(){
        System.out.println(str1.lastIndexOf(str2));
    }
    // toLowerCase() method returns the string in lowercase letter.
    void functionToLowerCase(){
        System.out.println(str1.toLowerCase());
    }
    // toUpperCase() method returns the string in uppercase letter.
    void functionToUpperCase(){
        System.out.println(str1.toUpperCase());
    }
    // split() method splits the string based on given regular expression.
    void functionToSplit(){
        System.out.println(str1.split(str2));
    }
    // valueOf() method converts given type such as int, long, float, double, boolean, char and char array into string.
    void functionToValueOf(){
        System.out.println(str1.valueOf(str2));
    }

    // join() method returns a string joined with given delimiter.
    void functionToJoin(){
        System.out.println(str1.join(str2));
    }
    // format() method returns the formatted string by given locale, format and arguments.
    void functionToFormat(){
        System.out.println(str1.format(str2));
    }

    // strip() method returns a string with leading and trailing whitespace removed.
    void functionToStrip(){
        System.out.println(str1.strip());
    }
    //chars() method returns a stream of characters in the string.
    void functionToChars(){
        System.out.println(str1.chars());
    }
    // codePoints() method returns a stream of code points in the string.
    void functionToCodePoints(){
        System.out.println(str1.codePoints());
    }
    //charAt() method returns a character at specified index.
    void functionToCharAt(){
        System.out.println(str1.charAt(0));
    }
    // codePointAt() method returns a character (Unicode code point) at specified index.
    void functionToCodePointAt(){
        System.out.println(str1.codePointAt(0));
    }
    // codePointBefore() method returns a character (Unicode code point) before the specified index.

    //length() method returns length of the string.
    void functionToLength(){
        System.out.println(str1.length());
    }
    //valueOf() method converts given type such as int, long, float, double, boolean, char and char array into string.
    void functionToValueOf1(){
        System.out.println(str1.valueOf(str2));
    }

    public void functionToSplitWithLimit() {
        String[] arrOfStr = str1.split(" ", 2);
        for (String a : arrOfStr)
            System.out.println(a);
    }
}