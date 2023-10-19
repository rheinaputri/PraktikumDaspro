import java.util.Scanner;

public class GudangPerulangan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jumlahBarang, barangKeluar, jumlahBarangMinim;

        System.out.print("Masukkan jumlah barang: ");
        jumlahBarang = sc.nextInt();
        System.out.print("Masukkan jumlah barang minim: ");
        jumlahBarangMinim = sc.nextInt();

        int i = 0;
        while (jumlahBarang > 0) {
            System.out.print("Masukkan jumlah barang keluar hari ke-" + (i+1) + ": ");
            barangKeluar = sc.nextInt();
            i++;


            if (jumlahBarang > jumlahBarangMinim) {
                jumlahBarang -= barangKeluar;
                System.out.println("sisa barang saat ini: " + jumlahBarang);
                // continue;
               
            } else if (jumlahBarang <= jumlahBarangMinim){
                System.out.println("sisa barang saat ini: " + jumlahBarang);
                System.out.println("Jumlah barang sudah mencapai batas minimum");
                break;
            }   
           
        } 
    }
}