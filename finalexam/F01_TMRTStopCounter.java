import java.util.Scanner;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        String[] stations = new String[n];
        for (int i = 0; i < n; i++) {
            stations[i] = scanner.next();
        }
        
        String start = scanner.next();
        String end = scanner.next();
        
        int startIndex = -1;
        int endIndex = -1;
        
        for (int i = 0; i < n; i++) {
            if (stations[i].equals(start)) {
                startIndex = i;
            }
            if (stations[i].equals(end)) {
                endIndex = i;
            }
        }
        
        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid");
        } else {
            int stopCount = Math.abs(startIndex - endIndex) + 1;
            System.out.println(stopCount);
        }
        
        scanner.close();
    }
}

/*
 * 時間複雜度：O(n)
 * 說明：程式需要遍歷一次輸入的站點序列來查找起始站和終點站的索引位置，
 *       其中 n 為輸入的站點數量。查找過程使用單次掃描，每個站點最多訪問一次，
 *       因此時間複雜度為線性 O(n)。
 */