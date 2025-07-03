import java.util.Scanner;

public class ColumnSum {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int[][] array = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        for (int j = 0; j < M; j++) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += array[i][j];
            }
            if (j > 0) {
                System.out.print(" ");
            }
            System.out.print(sum);
        }
        
        scanner.close();
    }
}