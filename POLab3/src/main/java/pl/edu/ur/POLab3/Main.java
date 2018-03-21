/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;
//import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Asia
 */
public class Main {

    /*
     * @param args the command line arguments
     */
    // metoda silnia zwraca silnię z liczby przekazanej jako parametr
// obliczenie silni odbywa się za pomocą rekurencji
/*
    public static int silnia(int wartosc) {
    
// jeśli przekazany parametr jest równy zero to zwróć 1
// a w przeciwnym wypadku zwróć wartość parametru * wywołanie metody silnia
// z parametrem o jeden mniejszym
if(wartosc == 0) return 1;
else return wartosc * silnia(wartosc - 1);
}*/
    //metody//funkcje
        public static int powerrek(int x, int potega) {
        if (potega == 0) {
            return 1;
        } else if (potega == 1) {
            return x;
        } else {
            return x * powerrek(x, potega - 1);
        }

    }
    public static int powerite(int x, int potega) {
        if (potega == 0) {
            return 1;
        }
        int z = 1;
        for (int i = 1; i <= potega; i++) {
            z *= x;
        }
        return z;
    }
    public static int funcf(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        return funcf(x - 1) + funcf(x - 2);
    }
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        Scanner keyb = new Scanner(System.in);
int zadanie;
        Scanner forzadanie = new Scanner(System.in);
        do {
            System.out.println("podaj wartosc zadania , 0 przerywa petle \n"
                    + "1 - zadanie 1.4\n"
                    + "2 - zadanie 1.7\n"
                    + "3 - zadanie 2.2\n"
                    + "4 - zadanie 3.3\n"
					+ "5 - zadanie 3.4");

            zadanie = forzadanie.nextInt();
			if (zadanie == 0) {
                System.out.println("0 konczy petle");
            } else if (zadanie == 1) {
			
        //Zadanie 1.4  
        int x=5;
        System.out.println("Wartosc x: "+x);
        x = x<<1;
        System.out.println("x = x>>1;: "+x); 
        x=5;
        x = x>>1;
        System.out.println("w prawo ze znakiem >>: "+x);
        x=5;
        x = x>>>1;
        System.out.println("w prawo bez znaku >>>: "+x);
        x=5;
} else if (zadanie == 2) {
//Zadanie 1.7   
        boolean a,b,x;
        a=false;
        b=true;
        x = a^b;
        System.out.println("bramka NOT");
        System.out.println("NOT "+x+" = "+!x);
        System.out.println("bramka XOR");
        System.out.println(a+ " XOR " +b+ " = " +x);
} else if (zadanie == 3) {
        //Zadanie 2.2
                String x = "abcd";
                String y = "bcdef";
                System.out.println("konwersja String do char");
                System.out.println(x.toCharArray()); //zamienia string na char
                System.out.println("koduje String w sekwencje bitów");
                System.out.println(Arrays.toString(x.getBytes())); //koduje string do nowej tablicy bajtów
                System.out.println("porównuje teksty");
                System.out.println(x.equals(y)); //porównuje 2 stringi oraz sprawdza czy sa takie same
                System.out.println("porównuje teksty ignorując wielkość znaków");
                System.out.println(x.equalsIgnoreCase(y)); //porównuje 2 stringi nie zwracając uwagi na wielkość liter
                System.out.println("porównuje leksykograficznie stringi");
                System.out.println(x.compareTo(y)); //porównuje 2 stringi lexykograficznie
                System.out.println("porównuje leksykograficznie stringi ignorując wielkość znaków");
                System.out.println(x.compareToIgnoreCase(y)); //porównuje 2 stringi lexykograficznie z pominięciem wielkości liter
                System.out.println("sprawdza w którym miejscu znajduje się znak i pierwszy index");
                System.out.println("c" + y.indexOf('t')); //wyznacza miejsce znaku
                System.out.println("sprawdza w którym miejscu znajduje się tekst i pierwszy index");
                System.out.println(x.indexOf(y)); //wyznacza indeks w pierwszym stringu z drugiego
                System.out.println("sprawdza w którym miejscu znajduje się znak i ostatni index");
                System.out.println(x.lastIndexOf(y)); //wyznacza miejsce ostatniego znaku w stringu
                System.out.println("zwraca podciąg, zaczynający się od podanego indexu");
                System.out.println(x.substring(2)); //tworzy podciąg z innego stringu
                System.out.println("zwraca podciąg, od indexu i kończący na podanym indexie");
                System.out.println(y.substring(3, 4)); //tworzy podciąg z innego stringu w przedziale
                System.out.println("zmienia znak tekstu nainny znak");
                System.out.println(x.replace('a', 'b')); //wymienia podane znaki w inne 
                System.out.println("tekst bez biaych znaków na końcu i początku");
                System.out.println(x.trim()); //zamienia znak na bez spacji
                System.out.println("wszystkie znaki małe");
                System.out.println(x.toLowerCase()); //zamienia znaki na male litery
                System.out.println("wszystkie znaki duże");
                System.out.println(x.toUpperCase()); //zamienia znaki na duze litery
                System.out.println("rozdziela tekst po wyrażeniu");
                System.out.println(x.toUpperCase()); //zamienia znaki na duze litery
                System.out.println("rozdziela tekst po wyrażeniu jakie wpiszemy do metody -limit");
                System.out.println(x.toUpperCase()); //zamienia znaki na duze litery
} else if (zadanie == 4) {
//Zadanie 3.3
        int x,potega;
        System.out.println("Podaj x: ");
        x=keyb.nextInt();
        System.out.println("Do ktorej potęgi: ");
        potega=keyb.nextInt();
        System.out.println("rekurencja: ");
        System.out.println(x+"^"+potega+" = " + powerrek(x, potega));
        System.out.println("iteracja: ");
        System.out.println(x+"^"+potega+" = " + powerite(x, potega));
} else if (zadanie == 5) {
        //Zadanie 3.4
        System.out.println("Wpisz wybrany wyraz ciągu: ");
        int x; 
        x = keyb.nextInt();
        System.out.println(funcf(x));

}} while (zadanie != 0);
/*  int a = 6; // 110
    int b = 4; // 100

// Bitwise AND    

int c = a & b;
//   110
// & 100
// -----
//   100

// Bitwise OR

int d = a | b;
//   110
// | 100
// -----
//   110

System.out.println(c); // 4
System.out.println(d); // 6
         */
 /*
Scanner sc = new Scanner(System.in);
System.out.print("Podaj liczbę: " ); 
// pobieramy od użytkownika liczbę
int liczba = sc.nextInt(); 
// wyświetlamy na ekranie obliczoną silnię
System.out.println(liczba + "! = " + silnia(liczba));
         */

 /*
int n;
    int iloczyn = 1;
    for (int i=1 i<=n; i++) {
        iloczyn *= i;
    }
    return iloczyn;
         */
    }
        }
