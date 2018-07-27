package sda.code.trojkaty;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParserTrojek {

    public int[] parsuj(String s) {
        if (s==null){
            throw new IllegalArgumentException("Ciąg jest pusty");
        }
        if (s.trim().isEmpty()) {

            throw new IllegalArgumentException("Ciąg jest pusty");
        }
        // +1 -> 1lub wiecej, * -> 0 lub więcej, ? ->
        String[] czesci = s.split("(,|\\s)+");
        System.out.println(Arrays.asList((czesci)));

        int[] wynik;
        try {
            wynik = Stream.of(czesci)
                    .filter((x ->!x.isEmpty()))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Nieprawidłowy format" , e);
        }
        if(wynik.length!=3){
            throw new IllegalArgumentException("Wymagane są trzy liczby");
        }


//        int[] wynik = int[3];
//        int i = 0;
//        for (String mozeLiczba : czesci){
//            if (mozeLiczba.isEmpty()){
//                continue;
 //           }
 //           i+=1;
//
//            if (i > wynik.length){
//                throw new IllegalArgumentException("wymagane są trzy liczby";)
//            }
//
//            try {
//                wynik[i] = Integer.parseInt(mozeLiczba);
//            } catch (NumberFormatException e){
//                throw new IllegalArgumentException("Nieprawidłowy format", e);
//            }

//            i+=1;
//        }
//        if (i<wynik.length){
//            throw new IllegalArgumentException("Wymagane są trzy liczby");
//        }
        return wynik;
    }
}
