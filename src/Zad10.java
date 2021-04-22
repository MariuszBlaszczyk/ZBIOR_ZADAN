
/*
Wylosuj do zmiennej a liczbę z przedziału <1,20>.
Pobieraj od użytkownika dwie liczby, dopóki ich średnia arytmetyczna
nie będzie różniła się od wartości zmiennej a o mniej niż 2.
 */


import java.util.Random;
import java.util.Scanner;

public class Zad10 {

    static int generateNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Random range is not correct");
        }
        return new Random().nextInt(max - min + 1) + min;
    }

    static int getNumberFromUser() {
        var scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static double calculateAverage(double... numbers) {
        int sum = 0;
        for (double value : numbers) {
            sum += value;
        }
        return sum * 1.0 / numbers.length;
    }

    public static void main(String[] args) {

        int min = 1;
        int max = 20;

        int a = generateNumber(min, max);
        System.out.println("The number a is: " + a + "\n");


        int number1, number2;

        do {
            System.out.println("Give the first number: ");
            number1 = getNumberFromUser();
            System.out.println("Give the second number: ");
            number2 = getNumberFromUser();
        } while (Math.abs(calculateAverage(number1, number2) - a) <= 2);

        System.out.println(number1);
        System.out.println(number2);
    }
}
