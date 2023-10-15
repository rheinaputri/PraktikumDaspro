import java.util.Scanner;

public class ProjectGudangPemilihan2{
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        String jenisProduk, detailProduk, letakProduk = " ";


        System.out.println("");
        System.out.println("********************");
        System.out.println("Data Jenis Produk : Bahan Pangan , Kesehatan Kecantikan");
        System.out.println("=========================================================");
        System.out.print("Masukkan Jenis Produk: ");
        jenisProduk = sc.nextLine();
        if (jenisProduk.equalsIgnoreCase("bahan pangan")) {
            System.out.println("=========================================================");
            System.out.println("Data Detail Produk\t: Makanan, Minuman");
            System.out.println("=========================================================");
        } else {
            System.out.println("=========================================================");
            System.out.println("Data Detail Produk\t: Kesehatan, Kecantikan");
            System.out.println("=========================================================");
        }
        System.out.print("Masukkan Detail Produk\t: ");
        detailProduk = sc.nextLine();
       

        if (jenisProduk.equalsIgnoreCase("bahan pangan")) {
            if (detailProduk.equalsIgnoreCase("makanan")) {
                letakProduk = "Rak 1";
            } else {
                letakProduk = "Kulkas / Rak 2";
            }
        } else if (jenisProduk.equalsIgnoreCase("kesehatan kecantikan")) {
            if (detailProduk.equalsIgnoreCase("kesehatan")) {
                letakProduk = "Rak 3";
            } else {
                letakProduk = "Rak 4";
            }
        } else {
            System.out.println("Jenis produk tidak valid: ");
        }
        System.out.print("Letak produk\t\t: " + letakProduk);
    }
}