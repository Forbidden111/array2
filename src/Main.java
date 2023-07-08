import java.util.Random;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;

        }
        System.out.println("Сумма равна = " + sum);
        System.out.println();

    }

    public static void task2() {
        int[] arr = generateRandomArray();

        int min = arr[0];
        int max = arr[0];

        for (int j : arr) {

            if (j < min) {
                min = j;
            }

            if (j > max) {
                max = j;
            }
        }
        System.out.println("Найденный минниму = " + min);
        System.out.println("Найденный максимум = " + max);

    }

    public static void task3() {
        int[] arr = generateRandomArray();

        int sum = 0;
        for (int j : arr) {
            sum += j;

        }

        double avverage =  ( double) sum / arr.length;

        System.out.println("Среднее значение = " + avverage);
    }

    public static void task4(){


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1 ; i >= 0 ; i--) {
            System.out.print( reverseFullName[i]);


        }
    }
}





