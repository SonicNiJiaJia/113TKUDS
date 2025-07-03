import java.util.Scanner;

public class AsciiConverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char ch = scanner.next().charAt(0);
        int ascii = (int) ch;
        System.out.println(ascii);
        
        scanner.close();
    }
}