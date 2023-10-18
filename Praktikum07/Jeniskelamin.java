import java.util.Scanner;

public class Jeniskelamin{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int jml_mhs = 30;

        while (i <= jml_mhs) {
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = input.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa (l/p): ");
            String jenis_kelamin = input.nextLine();

            if (jenis_kelamin.equalsIgnoreCase("p")) {
                System.out.println(nama);
            }

            i++;
        }
    }
}