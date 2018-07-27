package sda.code.trojkaty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Badamy trójkąty, podaj długości boków : ");
        ParserTrojek parser = new ParserTrojek();
                Trojkatnosc sprawdzacz = new Trojkatnosc();
       try (BufferedReader czytacz=  new BufferedReader(new InputStreamReader(System.in))){
           String linia = czytacz.readLine();
           int[] liczby = parser.parsuj(linia);
           boolean wynik = sprawdzacz.sprawdz(liczby[0], liczby[1],liczby[2]);
           if ( wynik ){
               System.out.println("To jest trójkąt");
           } else{
               System.out.println("To nie jest trójkąt");
           }
        } catch (IOException e){
           System.err.println("Błąd przy wczytywaniu : " +e.getMessage());
       }
    }
}
