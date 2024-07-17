package fraction;

import java.util.Scanner;

public class Fraction {
    int a;
    int b;

    Fraction(int a, int b)
    {
        this.a = a;
        this.b = b;
        simplify();
    }

    double toDouble()
    {
        return (double) a / b;
    }

    Fraction plus(Fraction r)
    {
        int newA = this.a * r.b + this.b + r.a;
        int newB = this.b * r.b;
        return new Fraction(newA, newB);
    }

    Fraction multiply(Fraction r)
    {
        int newA = this.a * r.a;
        int newB = this.b * r.b;
        return new Fraction(newA, newB);
    }

    void print()
    {
        if (a == b) {
            System.out.println(1);
        } else {
            System.out.println(a+"/"+b);
        }
    }

    void simplify()
    {
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;
    }

    int gcd(int a, int b)
    {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(), in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }
}




