/*
Pobierz od użytkownika wartość – liczbę rzeczywistą, którą przechowasz w zmiennej typu double o nazwie x.
        Dla pobranej wartości wyznacz wartość wielomianu 𝑊(𝑥)= 2𝑥12+3𝑥5−4𝑥2.
*/


import java.util.Scanner;

public class Zad1 {

    static int getNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Specifies a real number");
        return scan.nextInt();
    }

    static double valueOfPolynomial(double number) {
        double a = 2 * (Math.pow(number, 12));
        double b = 3 * (Math.pow(number, 5));
        double c = 4 * (Math.pow(number, 2));
        return a + b - c;
    }

    public static void main(String[] args) {

        var x = getNumberFromUser();

        System.out.println("The value of the polynomial for the given number is: "
                + valueOfPolynomial(x));
    }
}
