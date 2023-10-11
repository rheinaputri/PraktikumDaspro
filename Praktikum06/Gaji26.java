import java.util.Scanner;
public class Gaji26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        if(kategori.equalsIgnoreCase("pekerja")){
            if (penghasilan <= 2000000)
                pajak = 0.15;
            else if (penghasilan <= 3000000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih:" + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pekerja")){
            if (penghasilan <= 2000000)
                pajak = 0.15;
            else if (penghasilan <= 3000000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih:" + gajiBersih);
        } else
        System.out.println("Masukkan Kategorti Sa;lah");

        
    }
}