import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 1;
        int n = 1;

        while (n <= input) {
            n = i * i;
            if (n > input) {
                break;
            }
            System.out.println(n);
            i++;
        }
    }
}