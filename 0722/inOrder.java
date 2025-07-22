// 定義 TreeNode 類別
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class inOrder {
    
    // 實作二元樹的中序走訪（左 -> 根 -> 右）
    public static void inOrder(TreeNode root) {
        // 停止條件：空節點
        if (root == null) {
            return;
        }
        // 中序走訪：左子樹 -> 根節點 -> 右子樹
        inOrder(root.left);           // 遞迴左子樹
        System.out.print(root.data + " "); // 處理根節點
        inOrder(root.right);          // 遞迴右子樹
    }
    
    public static void main(String[] args) {
        System.out.println("=== 二元樹中序走訪測試 ===");
        
        // 建立測試樹:
        //       4
        //      / \
        //     2   6
        //    / \ / \
        //   1  3 5  7
        
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        
        System.out.print("中序走訪結果: ");
        inOrder(root); // 1 2 3 4 5 6 7
        System.out.println();
        
        // 建立另一個測試樹:
        //     1
        //      \
        //       2
        //        \
        //         3
        
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        root2.right.right = new TreeNode(3);
        
        System.out.print("右偏樹中序走訪: ");
        inOrder(root2); // 1 2 3
        System.out.println();
    }
}