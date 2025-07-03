import java.util.Scanner;

public class SpiralMatrix {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];
        
        int num = 1;
        int top = 0, bottom = N - 1, left = 0, right = N - 1;
        
        while (num <= N * N) {
            // Fill top row from left to right
            for (int j = left; j <= right && num <= N * N; j++) {
                matrix[top][j] = num++;
            }
            top++;
            
            // Fill right column from top to bottom
            for (int i = top; i <= bottom && num <= N * N; i++) {
                matrix[i][right] = num++;
            }
            right--;
            
            // Fill bottom row from right to left
            for (int j = right; j >= left && num <= N * N; j--) {
                matrix[bottom][j] = num++;
            }
            bottom--;
            
            // Fill left column from bottom to top
            for (int i = bottom; i >= top && num <= N * N; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
        
        // Output the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j]);
                if (j < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}