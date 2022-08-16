import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFormat = scanner.nextLine();

        switch (inputFormat) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
                System.out.println(area);
                break;

            case "rectangle":
                double l = scanner.nextInt();
                double w = scanner.nextInt();
                double rectangleArea =l * w;
                System.out.printf("%.1f", rectangleArea);
                break;

            case"circle":
                double r = scanner.nextInt();
                double cirArea = 3.14 * r * r;
                System.out.println(String.format("%.2f",cirArea));
                break;


        }
    }
}