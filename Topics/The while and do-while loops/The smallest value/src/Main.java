import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numberToCheck = scanner.nextLong();
        long n = 1;
        long fractal = 1;
        long i = 1;

        do {
            fractal = fractal * i;
            if (fractal > numberToCheck) {
                System.out.println(n);
                break;
            }
            i++;
            n++;
        } while (i <= numberToCheck);
    }
}