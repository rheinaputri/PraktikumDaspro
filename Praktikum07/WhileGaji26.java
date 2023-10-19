import java.util.Scanner;
public class WhileGaji26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahKaryawan, jumlahjamLembur;
        double gajiLembur, totalGajiLembur;
        String jabatan;

        gajiLembur = 0;
        totalGajiLembur = 0;

        System.out.println("Masukkan jumlah karyawan: ");
        jumlahKaryawan = sc.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");

            System.out.println("Masukkan jabatan karyawan ke- " + (i+i) + ":");
            jabatan = sc.nextLine();

            System.out.print("Masukkan jumlah jam lembur :");
            jumlahjamLembur = sc.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahjamLembur * 100000;                
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahjamLembur * 75000;
            }

            totalGajiLembur += gajiLembur;
            
        } System.out.println("Total gaji lembur :" + totalGajiLembur);
    }
}