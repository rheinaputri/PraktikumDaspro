import java.util.Scanner;

public class NestedLoop26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        double [][] suhu = new double [2][4];

        System.out.print("Masukkan jumlah kota: ");
        int jumlahKota = sc.nextInt();

       System.out.println("================================"); 
    //coba1
        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i + 1));

            for (int j=0; j < suhu[i].length; j++) {
                System.out.print("Suhu ke-" + (j+1) + ":");
                suhu[i][j] = sc.nextInt();
            }
            System.out.println();
        }

       System.out.println("================================"); 
       System.out.println();
//rekap
        for (double[] kota : suhu) {
            for (double s : kota) {
                System.out.print("KOTA KE-" + ":");
                System.out.println(s + " ");
            }
            System.out.println();
        }

        System.out.println("================================"); 
       System.out.println();
        //ratarata
        for (int i = 0; i < suhu.length; i++) {
            double total = 0;
            for (int j = 0; j < suhu[i].length; j++) {
                total += suhu[i][j];
            }
            double rata = total / suhu[i].length;
            System.out.println("Rata-rata suhu kota ke-" + (i + 1) + ": " + rata);
        }
    }
}