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

public class F11_BSTClosestValue {
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
        
        int T = scanner.nextInt();
        
        TreeNode root = buildTree(nodes);
        int closest = closestValue(root, T);
        
        System.out.println("Closest: " + closest);
        
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
    
    private static int closestValue(TreeNode root, int target) {
        int closest = root.val;
        TreeNode current = root;
        
        while (current != null) {
            int currentDiff = Math.abs(current.val - target);
            int closestDiff = Math.abs(closest - target);
            
            if (currentDiff < closestDiff || 
                (currentDiff == closestDiff && current.val < closest)) {
                closest = current.val;
            }
            
            if (current.val == target) {
                break;
            } else if (current.val < target) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        
        return closest;
    }
}