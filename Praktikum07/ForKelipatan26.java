import java.util.Scanner;
public class ForKelipatan26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kelipatan, total, counter, bilangan, mean=0;
        total = 0;
        counter = 0;

        System.out.println("Masukkan bilangan 1 - 9 : ");
        bilangan = sc.nextInt();

        for (int i = 0; i < 50; ++i) {
            if (i% bilangan == 0) {
                total += i;
                ++counter;
                mean = total/counter;
            
            }  
        }
        System.out.println("--- Rentang bilangan 1 sampai 50 ---");
        System.out.printf("Banyak bilangan kelipatan %d  : %d \n", bilangan, counter);
        System.out.printf("Total bilangan kelipatan %d   : %d \n", bilangan, total);
        System.out.printf("Rata-rata jumlah kelipatan %d : %d", bilangan, mean);
    } 
} 
