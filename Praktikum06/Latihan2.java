import java.util.Scanner;
public class Latihan2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        double jumlahBuku, totalDiskon;

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = sc.nextDouble();
        

        if (jenisBuku.equals("kamus")){
           if (jumlahBuku > 2) {
                totalDiskon = 0.10 + 0.02 ;
            System.out.println("Total diskon : " + totalDiskon);
           }
           else{
            System.out.println("Total diskon : 10%");
           }
        }
        
        else if ( jenisBuku.equals("novel") ){
            if (jumlahBuku > 3) {
                totalDiskon = 0.07 + 0.02 ;
            System.out.println("Total diskon : " + totalDiskon);
           }
           else{
            System.out.println("Total diskon : 8%");
           }
        } 

        else {
            if (jumlahBuku > 3){
                totalDiskon = 0.05;
                System.out.println("Total diskon : " + totalDiskon);
            }
            else {
                System.out.println("tidak dapat diskon");
            }
            
        }
 
    }
}