public class ArraySearcher {
    
    // 2. 實作一個方法 findElement(int[] array, int target)，搜尋指定的數值
    // 3. 如果找到，回傳該元素的索引；如果沒找到，回傳-1
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // 找到時回傳索引
            }
        }
        return -1;  // 沒找到時回傳-1
    }
    
    // 4. 實作一個方法 countOccurrences(int[] array, int target)，計算某個數值在陣列中出現的次數
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        // 1. 建立陣列：{12, 45, 23, 67, 34, 89, 56, 78, 91, 25}
        int[] numbers = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};
        
        // 顯示原始陣列
        System.out.print("原始陣列: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        // 5. 在主程式中測試搜尋數字 67 和數字 100，並輸出結果
        
        // 測試搜尋數字 67
        int target1 = 67;
        int index1 = findElement(numbers, target1);
        int count1 = countOccurrences(numbers, target1);
        
        System.out.println("\n搜尋數字 " + target1 + " 的結果:");
        if (index1 != -1) {
            System.out.println("找到了！索引位置: " + index1);
        } else {
            System.out.println("沒有找到");
        }
        System.out.println("出現次數: " + count1);
        
        // 測試搜尋數字 100
        int target2 = 100;
        int index2 = findElement(numbers, target2);
        int count2 = countOccurrences(numbers, target2);
        
        System.out.println("\n搜尋數字 " + target2 + " 的結果:");
        if (index2 != -1) {
            System.out.println("找到了！索引位置: " + index2);
        } else {
            System.out.println("沒有找到");
        }
        System.out.println("出現次數: " + count2);
        
        // 額外測試：搜尋重複數字的情況
        // 建立一個包含重複數字的陣列進行測試
        int[] testArray = {12, 45, 23, 67, 34, 67, 56, 67, 91, 25};
        System.out.println("\n額外測試 - 包含重複數字的陣列:");
        System.out.print("測試陣列: ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i]);
            if (i < testArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        int testTarget = 67;
        int testIndex = findElement(testArray, testTarget);
        int testCount = countOccurrences(testArray, testTarget);
        
        System.out.println("搜尋數字 " + testTarget + " 的結果:");
        if (testIndex != -1) {
            System.out.println("找到了！第一次出現的索引位置: " + testIndex);
        } else {
            System.out.println("沒有找到");
        }
        System.out.println("總共出現次數: " + testCount);
    }
}