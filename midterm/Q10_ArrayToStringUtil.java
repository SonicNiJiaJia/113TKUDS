import java.util.Scanner;

public class Q10_ArrayToStringUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        if (n == -1) {
            System.out.println(arrayToString(null));
        } else if (n == 0) {
            int[] arr = new int[0];
            System.out.println(arrayToString(arr));
        } else {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(arrayToString(arr));
        }
        
        scanner.close();
    }
    
    static String arrayToString(int[] arr) {
        if (arr == null) {
            return "null";
        }
        
        if (arr.length == 0) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        
        sb.append("]");
        return sb.toString();
    }
}