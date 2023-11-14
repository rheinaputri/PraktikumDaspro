import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        String nama, next;
        int baris, kolom;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine(); // Membuang newline

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                    System.out.println("Nomor baris/kolom kursi tidak tersedia");
                } else if (penonton[baris-1][kolom-1] != null) {
                    System.out.println("Kursi sudah ditempati oleh penonton lain");
                } else {
                    penonton[baris-1][kolom-1] = nama;
                }
            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": " + penonton[i][j]);
                        } else {
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": ***");
                        }
                    }
                }
            } else if (menu == 3) {
                System.out.println("Program berhenti");
                break;
            } else {
                System.out.println("Menu tidak valid");
            }
        }
    }
}