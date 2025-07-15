import java.util.Scanner;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] games = new int[n];
        for (int i = 0; i < n; i++) {
            games[i] = scanner.nextInt();
        }
        
        int k = scanner.nextInt();
        
        int[] ps = new int[n + 1];
        ps[0] = 0;
        for (int i = 1; i <= n; i++) {
            ps[i] = ps[i - 1] + games[i - 1];
        }
        
        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + ps[i]);
        }
        System.out.println();
        
        scanner.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：建立前綴和陣列需要遍歷 n 個元素，每個元素處理時間為常數
 * 輸出前 k 個前綴和的時間為 O(k)，總時間複雜度為 O(n)
 */