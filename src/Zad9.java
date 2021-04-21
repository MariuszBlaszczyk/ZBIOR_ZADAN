
/*
Wylosuj trzy liczby z przedziału odpowiednio <0, 10>, <-13, 23>, <34, 87>.
Oblicz średnią arytmetyczną wyznaczonych liczb i wypisz tą liczbę spośród losowanych wcześniej,
która ma wartość najbliżej obliczonej średniej.
 */

import java.util.Random;

public class Zad9 {

    static int generateNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Random range is not correct");
        }
        return new Random().nextInt(max - min + 1) + min;
    }

    static double calculateAverage(int... numbers) {
        int sum = 0;
        for (int value : numbers) {
sum += value;
        }
        return sum * 1.0 / numbers.length;
    }

    static double numberCloseToAverage (double average) {
        int number = 0;
        for (int i = 0; i < average; i--) {

        }
        return number;
    }


    public static void main(String[] args) {

        int min1 = 0;
        int max1 = 10;
        int min2 = -13;
        int max2 = 23;
        int min3 = 34;
        int max3 = 87;


        int number1 = generateNumber(min1, max1);
        int number2 = generateNumber(min2, max2);
        int number3 = generateNumber(min3, max3);

        double average = calculateAverage(number1, number2, number3);


    }
}

