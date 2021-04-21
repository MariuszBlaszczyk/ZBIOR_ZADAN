

/*
Pobierz od użytkownika liczbę typu int.
Następnie wypisz na ekranie wszystkie potęgi liczby 2,
które będą mniejsze od podanej liczby co najmniej o 5 .
 */

import java.util.Scanner;

public class Zad5 {

    static int getNumberFromUser() {
        var scan = new Scanner(System.in);
        return scan.nextInt();
    }


    static void powersOfTwoLessTheNumber(int num) {
        int a = num - 5;
        System.out.println("Powers of two less the number: ");
        for (int i = 2; i <= a; i *= 2) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {


        System.out.println("Enter the number:");
        int number = getNumberFromUser();
        powersOfTwoLessTheNumber(number);


    }
}


