import java.util.Objects;

public class CompareString {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World again";
        String str3 = new String("Hello World");
        String str4 = new String("Hello World for the third time");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str4);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equalsIgnoreCase(str4));
        System.out.println(str1.compareTo(str2));
        String myString = new String("Hello World");
        System.out.println(myString);

    }
}
