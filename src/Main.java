import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k, i=1;

        Scanner doa = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        k = doa.nextInt();

        while ( i <= k) {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
