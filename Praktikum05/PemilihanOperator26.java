import java.util.Scanner;
public class PemilihanOperator26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil= 0;
        char operator;
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        System.out.println("Masukkan angka 1 :");
        angka1 = sc.nextDouble();
        System.out.println("Masukkan angka 2 :");
        angka2 = sc.nextDouble();
        System.out.println("Masukkan operator (+ - * :)");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println(angka1 + " " + operator +  " "  + angka2 + " = " + hasil);
        }
        else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println(angka1 + " " + operator +  " "  + angka2 + " = " + hasil);
        }
        else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println(angka1 + " " + operator +  " "  + angka2 + " = " + hasil);
        }
        else if (operator == '/') {
            hasil = angka1 / angka2;
            System.out.println(angka1 + " " + operator +  " "  + angka2 + " = " + hasil);
        }
        else {
             System.out.println("Operator Invalid");
        }




        // switch (operator) {
        //     case '+' :
        //         hasil = angka1 + angka2;
        //         break;
        //     case '-' :
        //         hasil = angka1 - angka2;
        //         break;
        //     case '*' :
        //         hasil = angka1 * angka2;
        //         break;
        //     case '/' :
        //         hasil = angka1 / angka2;
        //         break;

        // }
        //langkah 8
        //   System.out.println(angka1 + operator + angka2 + " = " + hasil);
        //langkah 10
        //   System.out.println(angka1 + " " + operator +  " "  + angka2 + " = " + hasil);
    }
}