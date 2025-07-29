import java.util.Scanner;

class Item {
    String name;
    int qty;
    
    public Item(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }
}

public class F03_ConvenienceHotItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        Item[] items = new Item[n];
        
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int qty = scanner.nextInt();
            items[i] = new Item(name, qty);
        }
        
        insertionSort(items);
        
        int outputCount = Math.min(10, n);
        for (int i = 0; i < outputCount; i++) {
            System.out.println(items[i].name + " " + items[i].qty);
        }
        
        scanner.close();
    }
    
    private static void insertionSort(Item[] items) {
        int n = items.length;
        
        for (int i = 1; i < n; i++) {
            Item key = items[i];
            int j = i - 1;
            
            while (j >= 0 && items[j].qty < key.qty) {
                items[j + 1] = items[j];
                j--;
            }
            items[j + 1] = key;
        }
    }
}

/*
 * Time Complexity: O(n²)
 * 說明：程式使用插入排序對商品進行排序，其中n為商品數量。
 *       插入排序在最壞情況下需要進行n-1輪插入，每輪最多比較i次，
 *       總比較次數為1+2+...+(n-1) = n(n-1)/2，因此時間複雜度為O(n²)。
 */