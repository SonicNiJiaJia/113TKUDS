import java.util.Scanner;

public class ds_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("請輸入您的姓名: ");
        String name = scanner.nextLine();
        
        System.out.print("請輸入您的年齡: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // 消耗換行符
        
        System.out.print("請輸入您的城市: ");
        String city = scanner.nextLine();
        
        System.out.println("\n=== 個人資料 ===");
        System.out.println("姓名: " + name);
        System.out.println("年齡: " + age + " 歲");
        System.out.println("城市: " + city);
        
        scanner.close();
    }
}