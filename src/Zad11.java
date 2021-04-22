

/*
Wylosuj liczbę z przedziału <-0.45, 6.24>
a następnie sprawdź ile jest liczb naturalnych mniejszych od tak wylosowanej liczby.
 */

import java.util.Random;

public class Zad11 {

    static double generateDoubleNumbers(double min, double max) {
        if (min >= max) {
            throw new IllegalArgumentException("Illegal generation range");
        }
        return Math.random() * (max + min) - min;
    }

    static double howManyNaturalNumbersAreSmallerThanTheDrawnNumber(double number) {
        int counter = 0;
        for (double i = 1; i < number; i--) {
            if (i * 100 < number) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {

        double min = 0.45;
        double max = 6.24;

        double number = generateDoubleNumbers(min, max);
        System.out.println("The drawn number is: " + number);

        System.out.println(howManyNaturalNumbersAreSmallerThanTheDrawnNumber(number));


    }
}