import java.util.Scanner;
public class PemilihanHariDenganIf26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;
        // char operator;

        System.out.println("Masukkan angka 1 :");
        angka = sc.nextInt();

        if (angka >= 1 && angka <=5){
            System.out.println( angka + " "  + "adalah weekday");
        }
        else if (angka >= 6 && angka <=7){
           System.out.println( angka + " "  + "adalah weekend");
        }
        else {
            System.out.println( "Invalid Number");
        }
 }
}
    //     switch (operator) {
    //         case '+' :
    //             hasil = angka1 + angka2;
    //             break;
    //         case '-' :
    //             hasil = angka1 - angka2;
    //             break;
    //         case '*' :
    //             hasil = angka1 * angka2;
    //             break;
    //         case '/' :
    //             hasil = angka1 / angka2;
    //             break;

    //     }
    //     langkah 8
    //       System.out.println(angka1 + operator + angka2 + " = " + hasil);
    //     langkah 10
    //       System.out.println(angka1 + " " + operator +  " "  + angka2 + " = " + hasil);
//     }
// }