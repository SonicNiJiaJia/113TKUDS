import java.util.Scanner;

class Pair {
    int max;
    int second;
    
    public Pair(int max, int second) {
        this.max = max;
        this.second = second;
    }
}

public class F06_ArraySecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Pair result = findSecondLargest(arr, 0, n - 1);
        System.out.println("SecondMax: " + result.second);
        
        scanner.close();
    }
    
    private static Pair findSecondLargest(int[] arr, int left, int right) {
        if (left == right - 1) {
            if (arr[left] > arr[right]) {
                return new Pair(arr[left], arr[right]);
            } else {
                return new Pair(arr[right], arr[left]);
            }
        }
        
        if (left == right) {
            return new Pair(arr[left], Integer.MIN_VALUE);
        }
        
        int mid = left + (right - left) / 2;
        Pair leftResult = findSecondLargest(arr, left, mid);
        Pair rightResult = findSecondLargest(arr, mid + 1, right);
        
        return mergePairs(leftResult, rightResult);
    }
    
    private static Pair mergePairs(Pair left, Pair right) {
        if (left.max > right.max) {
            int newSecond = Math.max(left.second, right.max);
            return new Pair(left.max, newSecond);
        } else {
            int newSecond = Math.max(right.second, left.max);
            return new Pair(right.max, newSecond);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：使用分治法遞迴找出陣列中的最大值和第二大值，每個元素只會被訪問一次，
 *       遞迴樹的每一層處理所有n個元素，總共有log n層，
 *       每層的合併操作為常數時間，因此總時間複雜度為O(n)。
 */