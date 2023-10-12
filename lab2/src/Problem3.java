
import java.util.Random;
import java.util.Vector;

public class Problem3 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        int size = 20;
        Random random = new Random();
        for(int i = 0; i < size; i++){
            vector.add(random.nextInt(10));
        }
        System.out.println("generated vec: "+vector);
        System.out.println("counted : "+count(vector, 5));
        System.out.println("the max:"+ max(vector));
        System.out.println("the min pos:"+min(vector));
        System.out.println("the avrg:"+sum(vector));

    }
    public static int  count(Vector<Integer> vector, int number){
        int count = 0;
        for(int i = 0; i < vector.size(); i++){
            if(vector.get(i) == number){
                count++;
                vector.remove(number);
            }
        }
        return count;
    }
    public static int max(Vector <Integer> vector){
        int max = vector.get(0);
        for(int i = 0; i < vector.size(); i++){
            if(vector.get(i) > max){
                max = vector.get(i);
            }
        }
        return max;
    }
    public static int min(Vector<Integer> vector){
        int min = vector.get(0);
        int position = 0;
        for(int i = 0; i < vector.size(); i++){
            if(vector.get(i) < min){
                min = vector.get(i);
                position = i;
            }
        }
        return position;
    }
    public static int sum(Vector<Integer> vector){
        int sum = 0;
        for(int i = 0; i < vector.size(); i++){
            sum += vector.get(i);
        }
        return sum/ vector.size();
    }
}