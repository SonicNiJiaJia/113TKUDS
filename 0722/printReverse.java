// 定義 ListNode 類別
class ListNode {
    int data;
    ListNode next;
    
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class printReverse {
    
    // 反向列印鏈結串列的所有元素
    public static void printReverse(ListNode head) {
        // 停止條件：空節點
        if (head == null) {
            return;
        }
        // 先遞迴到最後，再列印（後進先出）
        printReverse(head.next);      // 遞迴到下一個節點
        System.out.print(head.data + " "); // 回溯時列印當前節點
    }
    
    // 輔助方法：正向列印（用於比較）
    public static void printForward(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== 鏈結串列反向列印測試 ===");
        
        // 建立鏈結串列: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        System.out.print("原始順序: ");
        printForward(head); // 1 2 3 4 5
        System.out.println();
        
        System.out.print("反向列印: ");
        printReverse(head); // 5 4 3 2 1
        System.out.println();
        
        // 建立單一節點的鏈結串列
        ListNode singleNode = new ListNode(42);
        System.out.print("單一節點反向列印: ");
        printReverse(singleNode); // 42
        System.out.println();
        
        // 測試空鏈結串列
        System.out.print("空鏈結串列反向列印: ");
        printReverse(null); // 無輸出
        System.out.println("(無輸出)");
    }
}