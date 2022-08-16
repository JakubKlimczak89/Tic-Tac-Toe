import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int sum = 0;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        for (int num :
                array) {
            sum += num;
        }
        System.out.println(sum);
    }
}