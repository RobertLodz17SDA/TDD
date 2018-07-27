package sda.code.trojkaty;

public class Trojkatnosc implements Parser {

    public boolean sprawdz(int a, int b, int c) {
        return (long) a+b>c && (long) a+c>b && (long) b+c>a;
    }
}
