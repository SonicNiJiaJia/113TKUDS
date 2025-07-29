import java.util.Scanner;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        int[] times = new int[n];
        String[] timeStrings = new String[n];
        
        for (int i = 0; i < n; i++) {
            timeStrings[i] = scanner.nextLine();
            times[i] = timeToMinutes(timeStrings[i]);
        }
        
        String query = scanner.nextLine();
        int queryMinutes = timeToMinutes(query);
        
        int left = 0;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (times[mid] <= queryMinutes) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        if (left < n) {
            System.out.println(timeStrings[left]);
        } else {
            System.out.println("No bike");
        }
        
        scanner.close();
    }
    
    private static int timeToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：程式使用二分搜尋在已排序的時間陣列中找到第一個大於查詢時間的索引，
 *       其中n為時間表的筆數。二分搜尋每次將搜尋範圍縮小一半，
 *       因此時間複雜度為對數級O(log n)。
 */