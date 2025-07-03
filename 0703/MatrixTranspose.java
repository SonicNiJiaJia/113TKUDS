import java.util.Scanner;

public class MatrixTranspose {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int[][] matrix = new int[N][M];
        
        // Read the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Output the transposed matrix
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(matrix[i][j]);
                if (i < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}