import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class F10_BSTRangeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line = scanner.nextLine().trim();
        String[] parts = line.split("\\s+");
        
        List<Integer> nodes = new ArrayList<>();
        for (String part : parts) {
            if (part.equals("-1")) {
                nodes.add(null);
            } else {
                nodes.add(Integer.parseInt(part));
            }
        }
        
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        
        TreeNode root = buildTree(nodes);
        int sum = rangeSumBST(root, L, R);
        
        System.out.println("RangeSum: " + sum);
        
        scanner.close();
    }
    
    private static TreeNode buildTree(List<Integer> nodes) {
        if (nodes.isEmpty() || nodes.get(0) == null) {
            return null;
        }
        
        TreeNode root = new TreeNode(nodes.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        int index = 1;
        while (!queue.isEmpty() && index < nodes.size()) {
            TreeNode current = queue.poll();
            
            if (index < nodes.size() && nodes.get(index) != null) {
                current.left = new TreeNode(nodes.get(index));
                queue.offer(current.left);
            }
            index++;
            
            if (index < nodes.size() && nodes.get(index) != null) {
                current.right = new TreeNode(nodes.get(index));
                queue.offer(current.right);
            }
            index++;
        }
        
        return root;
    }
    
    private static int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        
        int sum = 0;
        
        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }
        
        if (root.val > L) {
            sum += rangeSumBST(root.left, L, R);
        }
        
        if (root.val < R) {
            sum += rangeSumBST(root.right, L, R);
        }
        
        return sum;
    }
}