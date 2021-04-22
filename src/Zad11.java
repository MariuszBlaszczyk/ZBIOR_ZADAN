

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

    static int howManyNaturalNumbersAreSmallerThanTheDrawnNumber(double number) {
        int counter = 0;
        for (int i = 0; i < number; i++) {
            counter++;
        }
        return counter;
    }


    public static void main(String[] args) {

        double min = 0.45;
        double max = 6.24;

        double number = generateDoubleNumbers(min, max);
        System.out.println("The drawn number is: " + number + "\n");

        System.out.println("There are " + howManyNaturalNumbersAreSmallerThanTheDrawnNumber(number) +
                " natural numbers smaller than the number so drawn.");


    }
}