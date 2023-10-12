import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;

public class Problem1 {
    public static void main(String[] args) {
        String s1 = "si";
        String s2 = "sir1 si cu sir2 fac un sir3";

        int withSubstring = isWithSubstring(s1, s2);
        int countIndexOf = isWithIndexOf(s1, s2);

        System.out.println("Count using substring: " + withSubstring);
        System.out.println("Count using indexOf: " + countIndexOf);
    }

    public static int isWithSubstring(String s1, String s2) {
        int count = 0;
        int index = 0;

        while (index <= s2.length() - s1.length()) {
            String sub = s2.substring(index, index + s1.length());
            if (sub.equals(s1)) {
                count++;
            }
            index++;
        }

        return count;
    }

    public static int isWithIndexOf(String s1, String s2) {
        int count = 0;
        int index = 0;

        while (index < s2.length()) {
            index = s2.indexOf(s1, index);
            if (index == -1) {
                break;
            }
            count++;
            index = index + 1;
        }

        return count;
    }
}
