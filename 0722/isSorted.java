public class isSorted {
    
    // 檢查陣列是否已按升序排列
    public static boolean isSorted(int[] arr, int index) {
        // 停止條件：到達陣列末端，表示已排序
        if (index >= arr.length - 1) {
            return true;
        }
        // 如果當前元素大於下一個元素，表示未排序
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // 遞迴檢查下一個位置
        return isSorted(arr, index + 1);
    }
    
    public static void main(String[] args) {
        System.out.println("=== 檢查陣列排序測試 ===");
        
        int[] sortedArr = {1, 2, 3, 4, 5};
        int[] unsortedArr = {1, 3, 2, 4, 5};
        int[] singleElement = {42};
        int[] emptyArr = {};
        
        System.out.println("陣列 [1,2,3,4,5] 是否已排序: " + isSorted(sortedArr, 0)); // true
        System.out.println("陣列 [1,3,2,4,5] 是否已排序: " + isSorted(unsortedArr, 0)); // false
        System.out.println("陣列 [42] 是否已排序: " + isSorted(singleElement, 0)); // true
        
        // 處理空陣列的情況
        if (emptyArr.length == 0) {
            System.out.println("空陣列是否已排序: true");
        } else {
            System.out.println("空陣列是否已排序: " + isSorted(emptyArr, 0));
        }
    }
}