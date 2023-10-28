import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            int n = scanner.nextInt();
            int[] heights = new int[n];

            for (int i = 0; i < n; i++) {
                heights[i] = scanner.nextInt();
            }

            int rounds = 0;
            int maxHeight = 0;

            for (int i = 0; i < n; i++) {
                if (heights[i] > maxHeight) {
                    maxHeight = heights[i];
                }

                if (i == n - 1 || heights[i + 1] <= heights[i]) {
                    rounds++;
                    maxHeight = 0;
                }
            }

            System.out.println(rounds);

            t--;
        }
    }
}
