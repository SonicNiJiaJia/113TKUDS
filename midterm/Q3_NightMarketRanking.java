import java.util.Scanner;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextDouble();
        }
        
        selectionSort(scores);
        
        int outputCount = Math.min(5, n);
        for (int i = 0; i < outputCount; i++) {
            System.out.println(String.format("%.1f", scores[i]));
        }
        
        scanner.close();
    }
    
    private static void selectionSort(double[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            
            if (maxIndex != i) {
                double temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
    }
}

/*
 * Time Complexity: O(n²)
 * 說明：選擇排序需要進行 n-1 輪選擇，每輪需要比較 n-i 次
 * 總比較次數為 (n-1) + (n-2) + ... + 1 = n(n-1)/2，因此為 O(n²)
 */