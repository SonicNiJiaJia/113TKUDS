import java.util.Scanner;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            String timeStr = scanner.nextLine();
            times[i] = timeToMinutes(timeStr);
        }
        
        String queryStr = scanner.nextLine();
        int query = timeToMinutes(queryStr);
        
        int idx = binarySearch(times, query);
        
        if (idx == n) {
            System.out.println("No train");
        } else {
            System.out.println(minutesToTime(times[idx]));
        }
        
        scanner.close();
    }
    
    private static int timeToMinutes(String timeStr) {
        String[] parts = timeStr.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
    
    private static String minutesToTime(int minutes) {
        int hours = minutes / 60;
        int mins = minutes % 60;
        return String.format("%02d:%02d", hours, mins);
    }
    
    private static int binarySearch(int[] times, int query) {
        int left = 0;
        int right = times.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (times[mid] > query) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}

/*
 * Time Complexity: O(n + log n)
 * 說明：讀取 n 個時間並轉換為分鐘數需要 O(n) 時間
 * 二分搜尋在已排序的陣列中查找需要 O(log n) 時間
 */