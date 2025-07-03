import java.util.Scanner;

public class twonumplus {
    
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        String[] parts = input.split("\\+");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);
        
        int result = addTwoNumbers(num1, num2);
        
        System.out.println(result);
        
        scanner.close();
    }
}
