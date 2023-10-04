public class Problema6 {
    public static void main(String[] args) {
        int i =20;
        while( i > 0) {
            if(new Problema6().isPrime(i)) {
                System.out.println(+i);
            }
            i--;
        }
    }
    boolean isPrime(int n) {
        if(n<2) {
            return false;
        }
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
