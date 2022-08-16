import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        checkTriengle(a,b,c);

    }

    public static boolean check(double x, double y, double z) {
        if ((x + y) > z) {
            return true;
        }
        return false;
    }

    public static void checkTriengle(double a, double b, double c) {
        if (check(a, b, c) && check(a, c, b) && check(b, c, a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}