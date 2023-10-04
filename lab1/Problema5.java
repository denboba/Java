public class Problema5{

    //method to calculate power of a number
    public double calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * calculatePower(base, exponent - 1);
        } else {
            return 1 / (base * calculatePower(base, -exponent - 1));
        }
    }

    public void printPower(int base, int exponent) {
        double result = calculatePower(base, exponent);
        double mathPowResult = Math.pow(base, exponent);

        System.out.println("calculated " + result);
        System.out.println("Math.pow: " + mathPowResult);

        if (result == mathPowResult) {
            System.out.println("same result");
        } else {
            System.out.println("different result");
        }
    }

    public static void main(String[] args) {
        Problema5   calculator = new Problema5();

        int base = 2;
        int exponent = 3;

        calculator.printPower(base, exponent);
    }
}

