import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String dot = ".";
        String star = "*";
        int k = n / 2;

        String[][] starFigure = new String[n][n];

        for (int i = 0; i < starFigure.length; i++) {
            for (int j = 0; j < starFigure[i].length; j++) {
                starFigure[i][j] = dot;

                if (i == j) {
                    starFigure[i][j] = star;
                }
                if (i == n - j - 1) {
                    starFigure[i][j] = star;
                }
                if (j == k) {
                    starFigure[i][j] = star;
                }
                if (i == k) {
                    starFigure[i][j] = star;
                }
            }
        }

        for (int i = 0; i < starFigure.length; i++) {
            for (int j = 0; j < starFigure[i].length; j++) {

                System.out.print(starFigure[i][j] + " ");
            }
            System.out.println();
        }
    }
}