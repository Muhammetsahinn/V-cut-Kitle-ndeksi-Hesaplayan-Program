import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double boy,kilo;

        Scanner grs = new Scanner(System.in);

        System.out.println("boyunuzu giriniz");

        boy=grs.nextDouble();

        System.out.println("kilonuzu metre cinsinden giriniz");

        kilo=grs.nextInt();

        System.out.println("vucut kitle endeksiniz :" + kilo/(boy*boy));





    }
}
