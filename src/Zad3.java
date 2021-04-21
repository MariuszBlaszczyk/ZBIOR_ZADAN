
/*
Pobierz od użytkownika trzy liczby i zapisz je do zmiennych typu double
o nazwach liczba1, liczba2, liczba3.
Wyznacz średnią arytmetyczną największej i najmniejszej z pobranych liczb.
Sprawdź, czy obliczona średnia jest większa od liczby środkowej
(czyli nie największej i nie najmniejszej spośród trzech podanych).
 */


import java.util.Scanner;


public class Zad3 {

    static double getNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }


    static double minValue(double... numbers) {
        double min = Double.MAX_VALUE;
        for (double value : numbers) {
            min = Math.min(min, value);
        }
        return min;
    }

    static double maxValue(double... numbers) {
        double max = Double.MAX_VALUE;
        for (double value : numbers) {
            max = Math.max(max, value);
        }
        return max;
    }


    static double averageMinAndMax(double... numbers) {
        double min = minValue(numbers);
        double max = maxValue(numbers);
        double sum = min + max;
        return sum / 2.0;
    }

    static double midValue(double number1, double number2, double number3) {
        double min = minValue(number1, number2, number3);
        double max = maxValue(number1, number2, number3);
        double sum = number1 + number2 + number3;
        return sum - max - min;

    }

    static boolean hasBiggerAverageThanMiddle(double number1,double number2, double number3) {
        return averageMinAndMax(number1, number2, number3) > midValue(number1, number2, number3);
    }

    static boolean hasBiggerMiddleThan(double number1,double number2, double number3) {
        return averageMinAndMax(number1, number2, number3) < midValue(number1, number2, number3);
    }

    static void finalResult(double number1,double number2, double number3) {
        if (hasBiggerAverageThanMiddle(number1, number2, number3)) {
            System.out.println("The arithmetic mean is greater than the middle number.");
        } else if (hasBiggerMiddleThan(number1, number2, number3)) {
            System.out.println("The middle number is greater than the arithmetic mean.");
        } else {
            System.out.println("The artmetic mean and median number are equal to.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Give three numbers");
        System.out.println();
        System.out.println("Enter the first number:");
        double liczba1 = getNumberFromUser();
        System.out.println("Enter the second number:");
        double liczba2 = getNumberFromUser();
        System.out.println("Enter the third number:");
        double liczba3 = getNumberFromUser();

        System.out.println("The arithmetic mean of the smallest and the largest number is: " +
                averageMinAndMax(liczba1, liczba2, liczba3));

        finalResult(liczba1, liczba2, liczba3);


    }
}