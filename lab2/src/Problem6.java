import java.util.Vector;

public class Problem6 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(7.5);
        v.add("String");
        v.add(42);
        v.add(3.14);
        v.add(true);
        v.add('A');
        v.add(7.5);
        Vector types = new Vector();
        Vector counts = new Vector();
        for (Object obj : v) {
            Class type = obj.getClass();
            int index = types.indexOf(type);
            if (index == -1) {
                types.add(type);
                counts.add(1);
            } else {
                int currentCount = (int) counts.get(index);
                counts.set(index, currentCount + 1);
            }
        }
        for (int i = 0; i < types.size(); i++) {
            System.out.println("Types of " + types.get(i) + "appear " + counts.get(i) + " times.");
        }
    }
}