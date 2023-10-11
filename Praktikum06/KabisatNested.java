import java.util.Scanner;
public class KabisatNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan tahun : ");
        tahun = sc.nextInt();

        if ((tahun %400 == 0) && (tahun %100 != 0) || (tahun %4 == 0) && (tahun %100 !=0)){
            if ((tahun % 1000) !=0)
            System.out.println("Tahuh Kabisat");
        } else 
        System.out.println("Bukan Tahun Kabisat");
    }
}