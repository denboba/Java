public class SplitMethod{
public static void main(String[] args){
        String str = "I really want to learn java ";
        String[] str1 = str.split("want", 3);
        for (String str2 : str1){
        System.out.println(str2);
        }
    }
}
