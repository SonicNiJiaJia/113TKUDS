import java.util.Scanner;

public class FloatFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num = scanner.nextDouble();
        System.out.printf("%.2f", num);
        
        scanner.close();
    }
}