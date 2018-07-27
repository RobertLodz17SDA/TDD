package sda.code.intermediate.part1.exercises;

import sda.code.intermediate.part3.answers.smalldata.SmallDataHotele;

import java.math.BigInteger;

public class Algorithms {

    /**
     * Znajdź najmniejszy element w tablicy.
     */
    public int smallest(int array[]) {

        if (array == null){
            throw new IllegalArgumentException("Tablica niezdefiniowana");
        }
        if (array.length == 0){
            throw new IllegalArgumentException("Tablica niezdefiniowana");
        }
        int smaller = array[0];
        for (int e : array){
            if (e < smaller){
                smaller = e;
            }
        }
        return smaller;
    }

    /**
     * Znajdź największy element w tablicy.
     */
    public int largest(int array[]) {
        if (array == null){
            throw new IllegalArgumentException("Tablica niezdefiniowana");
        }
        if (array.length == 0){
            throw new IllegalArgumentException("Tablica niezdefiniowana");
        }
        int larger = array[0];
        for (int e : array){
            if (e > larger){
                larger = e;
            }
        }
        return larger;
    }
    /**
     * Oblicz silnię podanej liczby.
     */
    public long factorial(int n) {
      if ( n < 0 ) throw  new IllegalArgumentException("Nieozwolona wartość argumentu");
      if ( n == 0) return 1;
      int factResult = 1;
      for ( int i = 1; i <=n; i++){
          factResult = factResult*i;
      }
      return factResult;
    }

    /**
     * Oblicz n-ty wyraz ciągu Fibonacciego. Przyjmij fibonacci(0) == 0,
     * fibonacci(1) == 1
     */
    public long fibonacci(int n) {
        if ( n < 0 ) throw  new IllegalArgumentException("Nieozwolona wartość argumentu");
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    /**
     * Zmodyfikuj implementację stworzoną wcześniej tak, by działała z typem
     * BigInteger.
     */
    public BigInteger bigFibonacci(BigInteger n) {
        if ( n.intValue()==-1) throw new IllegalArgumentException("Niepoprawny argument metody");
        if (n.intValue()==0 || n.intValue()==1) return n;
        else return bigFibonacci(n.subtract(BigInteger.valueOf(1))).add(bigFibonacci(n.subtract(BigInteger.valueOf(2))));
    }

    /**
     * Stwórz tablicę zadanej długości, zawierającą losowe wartości.
     */
    public int[] createRandomArray(int length) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
