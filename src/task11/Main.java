package task11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length;

        while (true) {
            System.out.println("Введите размер вашего списка: ");
            try {
                String input = scanner.nextLine();
                length = Integer.parseInt(input);
                break;
            } catch (NumberFormatException exc) {
                System.out.println(exc.getMessage());
            }
        }

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            while (true) {
                System.out.println("Введите заполнеите список числами: ");
                try {
                    String input = scanner.nextLine();
                    array[i] = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        }

        while (true) {
            System.out.println("Введите два индекса интерисующие вас: ");
            try {
                String entry1 = scanner.nextLine();
                String entry2 = scanner.nextLine();
                System.out.println(array[Integer.parseInt(entry1)] / array[Integer.parseInt(entry2)]);
                break;
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException x) {
                System.out.println(x.getMessage());
            }
        }
    }
}