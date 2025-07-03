import java.util.Scanner;

public class numbercount {
    
    public static int calculate(int n) {
        return ((n + n) + (n * 5));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int result = calculate(n);
        
        System.out.println(result);
        
        scanner.close();
    }
}