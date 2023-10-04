public class Problema7{
    public static void main(String[] args) {
        int n = 10;
        Problema6 num = new Problema6();
        for (int i = 2; i <=  n; i += 2) {
            for (int j = 2; j <= i / 2; j++) {
                if (num.isPrime(j) && num.isPrime(i - j)) {
                    System.out.println(i + " = " + j + " + " + (i - j));
                    break; 
                }
            }
        }
    }
}
