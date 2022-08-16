import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        while (input != 0) {
            if (input % 2 != 0) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
            input = scanner.nextInt();
        }
    }
}