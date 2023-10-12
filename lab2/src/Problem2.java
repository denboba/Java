
import java.util.StringTokenizer;

public class Problem2 {
    public static void main(String[] args) {
        String s1 = "sir1 si sir2 sunt 2 sirur";
        String s2 ="si";
        System.out.println(toSplit(s1, s2));
        System.out.println( toString2(s1,s2));
    }
    public static int toSplit(String s1, String s2){
        String[] words = s1.split( " ");
        int count = 0;
        for(String word: words ){
            if(s2.equals(word)){
                count ++;
            }
        }
        return count;
    }
    public static int toString2(String s1, String s2){
        StringTokenizer st = new StringTokenizer(s1, " ");
        int count =0;
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.equals(s2)){
                count ++;
            }
        }
        return count;
    }
}