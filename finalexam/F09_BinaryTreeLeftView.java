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

public class F09_BinaryTreeLeftView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> nodes = new ArrayList<>();
        String line = scanner.nextLine().trim();
        String[] parts = line.split("\\s+");
        
        for (String part : parts) {
            if (part.equals("-1")) {
                nodes.add(null);
            } else {
                nodes.add(Integer.parseInt(part));
            }
        }
        
        TreeNode root = buildTree(nodes);
        List<Integer> leftView = getLeftView(root);
        
        System.out.print("LeftView:");
        for (int val : leftView) {
            System.out.print(" " + val);
        }
        System.out.println();
        
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
    
    private static List<Integer> getLeftView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                
                if (i == 0) {
                    result.add(current.val);
                }
                
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
        
        return result;
    }
}