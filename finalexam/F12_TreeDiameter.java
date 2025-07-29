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

public class F12_TreeDiameter {
    private static int maxDiameter = 0;
    
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
        
        TreeNode root = buildTree(nodes);
        maxDiameter = 0;
        calculateHeight(root);
        
        System.out.println("Diameter: " + maxDiameter);
        
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
    
    private static int calculateHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);
        
        int diameter = leftHeight + rightHeight;
        maxDiameter = Math.max(maxDiameter, diameter);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}