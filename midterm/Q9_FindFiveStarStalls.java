import java.util.Scanner;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextDouble();
        }
        
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] == 5.0) {
                cnt++;
            }
        }
        
        if (cnt == 0) {
            System.out.println("None");
        } else {
            int[] indices = new int[cnt];
            int idx = 0;
            
            for (int i = 0; i < n; i++) {
                if (scores[i] == 5.0) {
                    indices[idx++] = i;
                }
            }
            
            for (int i = 0; i < cnt; i++) {
                System.out.print(indices[i]);
                if (i < cnt - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}