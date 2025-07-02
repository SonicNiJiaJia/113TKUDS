import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q7permutation {
    // 全域變數計算排列數量
    static int ops = 0;
    // 儲存所有排列
    static ArrayList<String> permutations = new ArrayList<>();
    
    // 遞迴產生全排列
    public static void generatePermutations(int[] arr, boolean[] used, ArrayList<Integer> current) {
        // 基底條件：產生完整排列
        if (current.size() == arr.length) {
            ops++; // 每產生一個排列算一次操作
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < current.size(); i++) {
                sb.append(current.get(i));
                if (i < current.size() - 1) {
                    sb.append(" ");
                }
            }
            permutations.add(sb.toString());
            return;
        }
        
        // 嘗試每個數字
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(arr[i]);
                
                generatePermutations(arr, used, current);
                
                // 回溯
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 告知使用者輸入
        System.out.print("請輸入 n (<=8): ");
        int n = scanner.nextInt();
        
        // 建立陣列 [1, 2, 3, ..., n]
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        
        // 重置操作次數和排列清單
        ops = 0;
        permutations.clear();
        
        // 產生全排列
        boolean[] used = new boolean[n];
        ArrayList<Integer> current = new ArrayList<>();
        generatePermutations(arr, used, current);
        
        // 排序確保字典序
        Collections.sort(permutations);
        
        System.out.println("所有排列:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
        
        // 輸出操作次數
        System.out.println("操作次數: " + ops);
        
        scanner.close();
    }
}