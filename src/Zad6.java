
import java.util.Scanner;

/*
Pobieraj od użytkownika trzy liczby typu int do zmiennych a, b, c dopóki ich iloczyn
nie będzie liczbą większą od 10 oraz nie będzie zachodził warunek a < b < c.
Następnie oblicz sumę liczb z przedziałów <a,b> oraz <b,c> i wypisz na ekranie większa z otrzymanych sum.
 */
public class Zad6 {

    static int getNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    static int productThreeNumbers(int number1, int number2, int number3) {
        return number1 * number2 * number3;
    }

    static int sumOfInterval(int number1, int number2) {
        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            sum += i;
        }
        return sum;
    }

    static void printBiggerSum(int number1, int number2, int number3) {
        int sum1 = sumOfInterval(number1, number2);
        int sum2 = sumOfInterval(number2, number3);
        if (sum1 > sum2) {
            System.out.println("The sum of the first and second number is greater.");
        } else if (sum1 < sum2) {
            System.out.println("The sum of the second and third number is greater.");
        } else {
            System.out.println("The sums are equal.");
        }
    }

    public static void main(String[] args) {

        int a, b, c;

        do {
            System.out.println("Give the first number");
            a = getNumberFromUser();
            System.out.println("Give the second number");
            b = getNumberFromUser();
            System.out.println("Give the third number");
            c = getNumberFromUser();
        } while (!(productThreeNumbers(a,b,c) > 10 && a < b && b < c));


        printBiggerSum(a, b, c);

    }
}


