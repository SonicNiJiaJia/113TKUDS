import java.util.Scanner;

public class ArrayReverse {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        // Read the array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Output the reversed array
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}