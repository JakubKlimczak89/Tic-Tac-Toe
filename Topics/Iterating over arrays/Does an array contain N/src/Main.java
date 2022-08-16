import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        boolean isInside = false;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        for (int num :
                array) {
            if (n == num) {
                isInside = true;
            }
        }
        System.out.println(isInside);
    }
}