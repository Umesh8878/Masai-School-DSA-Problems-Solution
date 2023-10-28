import java.util.Scanner;

class Main {
    public static boolean validStack(int[] arr1, int[] arr2, int n) {
        int j = 0;
        int[] stack = new int[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            stack[++top] = arr1[i];
            while (top >= 0 && stack[top] == arr2[j]) {
                top--;
                j++;
            }
        }
        return top == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }
            boolean res = validStack(arr1, arr2, n);
            if (res) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
