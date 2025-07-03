import java.util.Scanner;

public class Cube3D {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[][][] cube = new int[N][N][N];
        
        // Fill the cube from outside to inside
        int num = 1;
        for (int layer = 0; layer < (N + 1) / 2; layer++) {
            // Fill the outer shell of current layer
            for (int z = layer; z < N - layer; z++) {
                for (int y = layer; y < N - layer; y++) {
                    for (int x = layer; x < N - layer; x++) {
                        // Check if this position is on the boundary of current layer
                        if (z == layer || z == N - layer - 1 || 
                            y == layer || y == N - layer - 1 || 
                            x == layer || x == N - layer - 1) {
                            if (cube[z][y][x] == 0) { // Not filled yet
                                cube[z][y][x] = num++;
                            }
                        }
                    }
                }
            }
        }
        
        // Output the cube
        for (int z = 0; z < N; z++) {
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < N; x++) {
                    System.out.print(cube[z][y][x] + " ");
                }
                System.out.println();
            }
            if (z < N - 1) {
                System.out.println();
            }
        }
        
        scanner.close();
    }
}