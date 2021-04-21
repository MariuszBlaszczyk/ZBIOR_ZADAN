/*
Wylosuj liczbę z przedziału <-50, 50> i zapisz ją w zmiennej typu całkowitoliczbowego o nazwie x.
Zbadaj, w którym z wymienionych przedziałów znajduje się wylosowana liczba:
 <-∞, -40), <-40, -20), <-20, 20>, (20, ∞).
 */


import java.util.Random;

public class Zad2 {

    static int generateNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Random range is not correct");
        }
        return new Random().nextInt(max - min + 1) + min;
    }


    static int rangeOf(int number) {
        if (number < -40) {
            return 1;
        } else if (number < -20) {
            return 2;
        } else if (number <= 20) {
            return 3;
        } else {
            return 4;
        }
    }


    static int finalResult(int number) {
        int range = rangeOf(number);
        String result;
        switch (range) {
            case 1 -> result = "P1";
            case 2 -> result = "P2";
            case 3 -> result = "P3";
            case 4 -> result = "P4";
            default -> result = "Number out of range";
        }
        System.out.println(result);
        return range;
    }


    public static void main(String[] args) {

        int min = -50;
        int max = 50;
        int x = generateNumber(min, max);


        System.out.print("The number " + x + " is in: ");


        finalResult(x);
    }
}

