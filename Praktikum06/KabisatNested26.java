import java.util.Scanner;
public class KabisatNested26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan tahun : ");
        tahun = sc.nextInt();


        if ((tahun %400) == 0) {
        } else if ((tahun % 100) == 0){
            System.out.println("Tahuh Kabisat");
        } else if ((tahun % 100) == 0){
            System.out.println("Tahuh Kabisat");
        } else 
        System.out.println("Bukan Tahun Kabisat");
    }
}