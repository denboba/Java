
import java.util.Random;
import java.util.Vector;

public class Problem4 {
    public static void main(String[] args) {
        Vector<Integer> setOne = new Vector<>();
        Vector<Integer> setTwo = new Vector<>();
        Random random = new Random();
        int size = 10;
        while (setOne.size() < 10) {
            int nr = random.nextInt(10);
            int nr2 = random.nextInt(10);
            if (!setOne.contains(nr)) {
                setOne.add(nr);

            }
            if (!setTwo.contains(nr2)) {
                setTwo.add(nr2);
            }
        }
        System.out.println("setOne = " + setOne);
        System.out.println("setTwo = " + setTwo);
        Vector<Integer> union = union(setOne, setTwo);
        System.out.println("union = " + union);
        Vector<Integer> intersection = Intersection(setOne, setTwo);
        System.out.println("intersection = " + intersection);
        Vector<Integer> difference = Difference(setOne, setTwo);
        System.out.println("difference = " + difference);


    }
    public static Vector<Integer> union (Vector setOne, Vector setTwo ){
        Vector<Integer> union = new Vector<>();
        for (int i = 0; i < setOne.size(); i++) {
            union.add((Integer) setOne.get(i));
        }
        for (int i = 0; i < setTwo.size(); i++) {
            if (!union.contains(setTwo.get(i))){
                union.add((Integer) setTwo.get(i));
            }
        }
        return union;

    }
    public static Vector<Integer> Intersection(Vector setOne,Vector setTwo){
        Vector<Integer> intersection = new Vector<>();
        for (int i = 0; i < setOne.size(); i++) {
            if (setTwo.contains(setOne.get(i))){
                intersection.add((Integer) setOne.get(i));
            }
        }
        return intersection;

    }
    public static Vector<Integer> Difference(Vector setOne,Vector setTwo) {
        Vector<Integer> difference = new Vector<>();
        for (int i = 0; i < setOne.size(); i++) {
            if (!setTwo.contains(setOne.get(i))) {
                difference.add((Integer) setOne.get(i));
            }
        }
        return difference;
    }


}
