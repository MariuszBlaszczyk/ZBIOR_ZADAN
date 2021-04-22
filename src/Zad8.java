
/*
Pobieraj od użytkownika liczby typu int do zmiennych a i b dopóki a nie będzie mniejsze od b.
Następnie wyznacz iloczyn tych liczb z przedziału <a,b>, których cyfra jedności jest liczbą pierwszą.
 */

import java.util.Scanner;

;

public class Zad8 {

    static int getNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    static int unities(int number) {
        return number % 10;
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        double sqrt = Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int productOfTheNumbersInterval(int number1, int number2) {
        int product = 1;
        for (int i = number1; i <= number2; i++) {
            if (isPrime(unities(i))) {
                product *= i;
            }
        }
        return product;
    }


    public static void main(String[] args) {

        int a, b;

        do {
            System.out.println("Give the first number");
            a = getNumberFromUser();
            System.out.println("Give the second number");
            b = getNumberFromUser();
            if (a > b) {
                System.out.println("A must be less than B!!!");
            }
        } while (!(a < b));

        System.out.println("The product of those numbers from the interval <a,b> whose unity digit is prime " +
                productOfTheNumbersInterval(a, b));

    }
}

