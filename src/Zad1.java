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
        double a = (Math.pow(2 * number, 12));
        double b = (Math.pow(3 * number, 5));
        double c = (Math.pow(4 * number, 2));
        return a + b - c;
    }

    public static void main(String[] args) {

        var x = getNumberFromUser();

        System.out.println("Wartość wielomianu dla podanej liczby wynosi: "
                + valueOfPolynomial(x));
    }
}
