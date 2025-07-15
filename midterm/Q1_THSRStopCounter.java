import java.util.Scanner;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        String[] stations = new String[n];
        for (int i = 0; i < n; i++) {
            stations[i] = scanner.next();
        }
        
        String start = scanner.next();
        String end = scanner.next();
        
        int startIdx = -1;
        int endIdx = -1;
        
        for (int i = 0; i < n; i++) {
            if (stations[i].equals(start)) {
                startIdx = i;
            }
            if (stations[i].equals(end)) {
                endIdx = i;
            }
        }
        
        if (startIdx == -1 || endIdx == -1) {
            System.out.println("Invalid");
        } else {

            int stopCount = Math.abs(startIdx - endIdx) + 1;
            System.out.println(stopCount);
        }
        
        scanner.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：需要遍歷所有 n 個站點來尋找起點和終點的索引位置
 * 其中 n 為停靠站數，每個站點最多被檢查一次
 */