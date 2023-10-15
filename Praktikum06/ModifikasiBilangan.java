import java.util.Scanner;
public class ModifikasiBilangan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3;
        int max, middle, min;

        System.out.print("Masukkan bil1 : ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bil2 : ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan bil3 : ");
        bil3 = sc.nextInt();

        if ( bil2 > bil1 ){
            if ( bil2 > bil3 ){
                max = bil2;
                if ( bil3 > bil1) {
                    middle = bil3;
                    min = bil1;
                } else {
                    middle = bil1;
                    min = bil3;
                }
            } else {
                max = bil3;
                if (bil2 > bil1) {
                    middle = bil2;
                    min = bil1;
                } else {
                    middle = bil1;
                    min = bil2;
                }
            }
        
        } else {
            max = bil1;
                if (bil2 > bil3) {
                    middle = bil2;
                    min = bil3;
                } else {
                    middle = bil3;
                    min = bil2;
                }
        }
        System.out.println("Bilangan terbesar adalah " + max);
        System.out.println("Bilangan tengah adalah " + middle);
        System.out.println("Bilangan terkecil adalah " + min);
}}
