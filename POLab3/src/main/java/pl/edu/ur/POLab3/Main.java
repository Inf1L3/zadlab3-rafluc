/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;
import java.util.*; 
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
public static int silnia(int wartosc) {
// jeśli przekazany parametr jest równy zero to zwróć 1
// a w przeciwnym wypadku zwróć wartość parametru * wywołanie metody silnia
// z parametrem o jeden mniejszym
if(wartosc == 0) return 1;
else return wartosc * silnia(wartosc - 1);
}
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
      /*  
        int a = 6; // 110
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


int n;
    int iloczyn = 1;
    for (int i=1 i<=n; i++) {
        iloczyn *= i;
    }
    return iloczyn;

 }
}
    



