import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int reverse = number % 10;
        int reverse1 = number % 100 / 10;
        int reverse2 = number / 100;
        System.out.println((reverse * 100) + (reverse1 * 10) + reverse2);
    }
}