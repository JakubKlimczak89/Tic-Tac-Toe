import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }

        }
        System.out.println(min);
    }
}
