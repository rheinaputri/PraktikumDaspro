import java.util.Scanner;
public class ArrayBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // buat variabel bertipe array 4 elemen
        int[] bil = new int[4];

        // isi array bil dengan angka dibawah
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        // tampilkan elemen
        System.out.println(bil[0]);
        System.out.println(bil[1]);
        System.out.println(bil[2]);
        System.out.println(bil[3]);

    }
}