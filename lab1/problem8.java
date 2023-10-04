import java.util.Arrays;

public class problem8{
    public static void main(String[] args) {
        int size = 20; // size of the arrays
        double[] doubleNumbers = new double[size];
        int[] intNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            doubleNumbers[i] = Math.random() * 100;
            intNumbers[i] = (int) doubleNumbers[i];
        }

        System.out.println("ORIGINAL VECTOR:");
        System.out.println(Arrays.toString(intNumbers));

        // sorting with sort() function
        Arrays.sort(intNumbers);

        System.out.println("Sorted Vector:");
        System.out.println(Arrays.toString(intNumbers));

     int target = 10; // number to be searched

        // binary search
        int index = Arrays.binarySearch(intNumbers, target);

        if (index >= 0) {
            System.out.println("\nNumber " + target + " is found at " + index + " in the vector!.");
        } else {
            System.out.println("\nNumber " + target + " is not found ?.");
        }
    }
}

