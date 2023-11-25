package problem1;

import java.util.Objects;
import java.util.Scanner;

public class Fraction {
private int numerator;
  private int denominator;
  public Fraction(int a, int b){
      this.numerator = a;
        this.denominator = b;

  }
  public Fraction(){
      new Fraction(0,0);
  }
    public String sum(Fraction that){
       return ( this.numerator*that.denominator+ this.denominator*that.numerator)+"/" +(this.denominator*that.denominator);
    }
    public String sub (Fraction a){
        return (this.numerator*a.denominator- this.denominator*a.numerator) + "/" + (this.denominator*a.denominator);
    }
    public String mul( Fraction a){
      return  (this.numerator*a.numerator) +"/"+(this.denominator*a.denominator);

    }
    public String div(Fraction a){
      return (this.numerator*a.denominator)+"/"+(this.denominator*a.numerator);
    }
@Override
public String toString(){
        return this.numerator+"/"+this.denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fraction)) return false;
        return numerator ==((Fraction) o).numerator &&
                denominator == ((Fraction)o).denominator;
    }
}

class TestFraction{
    public static void main(String[] args) {
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(1,3);
        //System.out.println(a.equals(b));
        System.out.println(a + " + " + b+ " is :"+ a.sum(b));
        System.out.println(a+ " - " + b+ " is :"+ a.sub(b));
        System.out.println(a+ " * " + b+ " is :"+ a.mul(b));
        System.out.println(a+ " / " + b+ " is :"+ a.div(b));
    }
}

