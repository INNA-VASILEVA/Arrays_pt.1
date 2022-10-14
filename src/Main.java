import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
//1.1
        double[] doubles = {1.57, 7.654, 9.986};
//1.2
        byte[] bytes = {2, 4, 6, 8, 12};


        //Задание 2
        System.out.println("Задание 2");
        for (int n = 0; n < numbers.length; n++) {
            System.out.print(numbers[n]);
            if (n != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int d = 0; d < doubles.length; d++) {
            System.out.print(doubles[d]);
            if (d != doubles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (byte i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]);
            if (i != bytes.length - 1) {
                System.out.print(", ");
            }
        }

        //Задание 3
        System.out.println("\nЗадание 3");
        for (int n = numbers.length - 1; n >= 0; n--) {
            System.out.print(numbers[n]);
            if (n != 0) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int d = doubles.length - 1; d >= 0; d--) {
            System.out.print(doubles[d]);
            if (d != 0) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int i = bytes.length - 1; i >= 0; i--) {
            System.out.print(bytes[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        //Задание 4
        System.out.println("\nЗадание 4");
        for (int n = 0; n < numbers.length; n++) {
            if (numbers[n] % 2 != 0) {
                numbers[n] += 1;
            }
            System.out.print(numbers[n]);
            if (n != 2) {
                System.out.print(", ");


            }
        }
    }
}