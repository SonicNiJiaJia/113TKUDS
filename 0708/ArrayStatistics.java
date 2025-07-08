public class ArrayStatistics {
    
    // 計算總和
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    
    // 計算平均值
    public static double calculateAverage(int[] array) {
        return (double) calculateSum(array) / array.length;
    }
    
    // 尋找最大值
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    // 尋找最小值
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    // 尋找最大值的索引
    public static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    // 尋找最小值的索引
    public static int findMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    // 計算大於平均值的數字個數
    public static int countAboveAverage(int[] array, double average) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                count++;
            }
        }
        return count;
    }
    
    // 計算偶數個數
    public static int countEvenNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
    // 計算奇數個數
    public static int countOddNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    
    // 顯示陣列內容
    public static void displayArray(int[] array) {
        System.out.print("陣列內容: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        // 1. 建立陣列：{5, 12, 8, 15, 7, 23, 18, 9, 14, 6}
        int[] numbers = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};
        
        // 顯示原始陣列
        displayArray(numbers);
        System.out.println();
        
        // 2. 計算各種統計數據
        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        int max = findMax(numbers);
        int min = findMin(numbers);
        int maxIndex = findMaxIndex(numbers);
        int minIndex = findMinIndex(numbers);
        int aboveAverageCount = countAboveAverage(numbers, average);
        int evenCount = countEvenNumbers(numbers);
        int oddCount = countOddNumbers(numbers);
        
        // 3. 以表格形式輸出所有統計結果
        System.out.println("===========================================");
        System.out.println("           陣列統計分析結果");
        System.out.println("===========================================");
        
        System.out.printf("%-24s | %10s\n", "統計項目", "結果");
        System.out.println("-------------------------------------------");
        System.out.printf("%-24s | %10d\n", "陣列長度", numbers.length);
        System.out.printf("%-26s | %10d\n", "總和", sum);
        System.out.printf("%-25s | %10.2f\n", "平均值", average);
        System.out.println("-------------------------------------------");
        System.out.printf("%-25s | %10d\n", "最大值", max);
        System.out.printf("%-21s | %10d\n", "最大值索引位置", maxIndex);
        System.out.printf("%-25s | %10d\n", "最小值", min);
        System.out.printf("%-21s | %10d\n", "最小值索引位置", minIndex);
        System.out.println("-------------------------------------------");
        System.out.printf("%-18s | %10d\n", "大於平均值的數字個數", aboveAverageCount);
        System.out.printf("%-24s | %10d\n", "偶數個數", evenCount);
        System.out.printf("%-24s | %10d\n", "奇數個數", oddCount);
        System.out.println("===========================================");
        
        // 顯示詳細的分析資訊
        System.out.println("\n詳細分析:");
        System.out.println("大於平均值(" + String.format("%.2f", average) + ")的數字:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                System.out.println("  - 索引 " + i + ": " + numbers[i]);
            }
        }
        
        System.out.println("偶數:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("  - 索引 " + i + ": " + numbers[i]);
            }
        }
        
        System.out.println("奇數:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println("  - 索引 " + i + ": " + numbers[i]);
            }
        }
    }
}