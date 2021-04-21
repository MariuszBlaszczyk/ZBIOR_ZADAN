/*
Pobierz od użytkownika dwie zmienne typu double o nazwach bok1 oraz bok2.
Będą one reprezentowały boki trójkątów równobocznych.
Zaimplementuj instrukcję, która wyświetli na ekranie informację,
jakim procentem pola trójkąta równobocznego o boku bok1 jest pole trójkąta równobocznego o boku bok2.
 */

import java.util.Scanner;

public class Zad4 {

    static double getNumberFromUser() {
        var scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    static double areaOfTriangle(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Side is not correct");
        }
        double pow = Math.pow(a, 2);
        double sqrt =Math.sqrt(3);
        double multiplier = pow * sqrt;
        return multiplier / 4.0;
    }

    static double areaPercent(double a, double b) {
        return (areaOfTriangle(a) / areaOfTriangle(b)) * 100.0;
    }

    public static void main(String[] args) {


        System.out.println("Give the length of the side of the first equilateral triangle");
        double bok1 = getNumberFromUser();
        while (bok1 <= 0) {
            System.out.println("Specified length must be greater than 0");
            System.out.println("Give the length of the side of the first equilateral triangle");
            bok1 = getNumberFromUser();

            System.out.println("Give the length of the side of the second equilateral triangle");
            double bok2 = getNumberFromUser();
            while (bok2 <= 0) {
                System.out.println("Specified length must be greater than 0");
                System.out.println("Give the length of the side of the second equilateral triangle");
                bok2 = getNumberFromUser();
            }

            System.out.println("The percentage is: " + areaPercent(bok1, bok2) + "%");
        }
    }
}