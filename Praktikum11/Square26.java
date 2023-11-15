import java.util.Scanner;

public class Square26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah *: ");
        int n = sc.nextInt();
        
        //inner loop
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        // System.out.println();

        //outer loop
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
