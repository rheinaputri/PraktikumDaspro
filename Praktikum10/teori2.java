public class teori2 {
    public static void main(String[] args) {
    

        for (int i = 0; i <= 10; i = i + 1) {
        for (int j = 0; j < 10 - i; ++j) {
        System.out.print(" ");
    }
    for (int j = 0; j < i; ++j) {
        System.out.print("*");
    }
    System.out.println();
        }
}

}