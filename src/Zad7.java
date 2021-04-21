
import java.util.Scanner;

/*
Pobieraj od użytkownika liczby, dopóki nie poda on liczby większej od 100.
Wyznacz spośród podanych liczb liczbę o największej sumie cyfr.
 */
public class Zad7 {

    static int getNumberFromUser(){
        var scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter number value greater than one hundred");
            number = scan.nextInt();
        } while (!(number > 100));
        return number;
    }

    static int sumDigits (int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        int number = getNumberFromUser();

    }
}
