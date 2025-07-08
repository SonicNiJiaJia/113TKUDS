public class ArrayUtility {
    
    // 列印陣列內容，格式為 [元素1, 元素2, ...]
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    
    // 原地反轉陣列
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
            // 交換元素
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            left++;
            right--;
        }
    }
    
    // 建立陣列的副本
    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }
    
    // 找出第二大的數值
    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("陣列長度必須至少為2");
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // 找出最大值和第二大值
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("陣列中沒有第二大的數值（所有元素都相同）");
        }
        
        return secondLargest;
    }
    
    // 輔助方法：檢查兩個陣列是否相等
    public static boolean arraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // 1. 建立陣列：{3, 7, 1, 9, 4, 6, 8, 2, 5}
        int[] numbers = {3, 7, 1, 9, 4, 6, 8, 2, 5};
        
        System.out.println("===========================================");
        System.out.println("           陣列操作工具測試");
        System.out.println("===========================================");
        
        // 測試 printArray 方法
        System.out.println("1. 測試 printArray 方法:");
        System.out.print("原始陣列: ");
        printArray(numbers);
        System.out.println();
        
        System.out.println("\n-------------------------------------------");
        
        // 測試 copyArray 方法
        System.out.println("2. 測試 copyArray 方法:");
        int[] copiedArray = copyArray(numbers);
        System.out.print("複製的陣列: ");
        printArray(copiedArray);
        System.out.println();
        System.out.println("驗證複製是否成功: " + arraysEqual(numbers, copiedArray));
        System.out.println("驗證是否為不同的陣列物件: " + (numbers != copiedArray));
        
        System.out.println("\n-------------------------------------------");
        
        // 測試 findSecondLargest 方法
        System.out.println("3. 測試 findSecondLargest 方法:");
        System.out.print("原始陣列: ");
        printArray(numbers);
        System.out.println();
        
        try {
            int secondLargest = findSecondLargest(numbers);
            System.out.println("第二大的數值: " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println("錯誤: " + e.getMessage());
        }
        
        System.out.println("\n-------------------------------------------");
        
        // 測試 reverseArray 方法
        System.out.println("4. 測試 reverseArray 方法:");
        System.out.print("反轉前: ");
        printArray(numbers);
        System.out.println();
        
        reverseArray(numbers);
        System.out.print("反轉後: ");
        printArray(numbers);
        System.out.println();
        
        System.out.println("\n-------------------------------------------");
        
        // 額外測試：演示原地反轉的效果
        System.out.println("5. 額外測試 - 驗證原地反轉:");
        System.out.print("複製的陣列（未反轉）: ");
        printArray(copiedArray);
        System.out.println();
        System.out.print("原始陣列（已反轉）: ");
        printArray(numbers);
        System.out.println();
        System.out.println("兩個陣列是否不同: " + (!arraysEqual(numbers, copiedArray)));
        
        System.out.println("\n-------------------------------------------");
        
        // 測試邊界情況
        System.out.println("6. 邊界情況測試:");
        
        // 測試包含重複數字的陣列
        int[] duplicateArray = {5, 5, 3, 3, 1};
        System.out.print("包含重複數字的陣列: ");
        printArray(duplicateArray);
        System.out.println();
        try {
            int secondLargest = findSecondLargest(duplicateArray);
            System.out.println("第二大的數值: " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println("錯誤: " + e.getMessage());
        }
        
        // 測試所有元素相同的陣列
        int[] sameArray = {7, 7, 7, 7};
        System.out.print("所有元素相同的陣列: ");
        printArray(sameArray);
        System.out.println();
        try {
            int secondLargest = findSecondLargest(sameArray);
            System.out.println("第二大的數值: " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println("錯誤: " + e.getMessage());
        }
        
        System.out.println("\n===========================================");
        System.out.println("           測試完成");
        System.out.println("===========================================");
    }
}