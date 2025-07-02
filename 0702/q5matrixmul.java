import java.util.Scanner;

public class q5matrixmul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 告知使用者輸入方陣大小
        System.out.print("請輸入方陣大小 n: ");
        int n = scanner.nextInt();
        
        // 讀取矩陣 A
        int[][] A = new int[n][n];
        System.out.print("請輸入矩陣 A (" + n + "x" + n + "個數字):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        
        // 讀取矩陣 B
        int[][] B = new int[n][n];
        System.out.print("請輸入矩陣 B (" + n + "x" + n + "個數字):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        
        // 計算矩陣乘法 C = A × B
        int[][] C = new int[n][n];
        int ops = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                    ops++; // 每次乘法加法運算算一次操作
                }
            }
        }
        
        // 輸出結果矩陣 C
        System.out.println("結果矩陣 C:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.println("操作次數: " + ops);
        
        scanner.close();
    }
}