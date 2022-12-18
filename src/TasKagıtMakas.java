import java.util.Random;
import java.util.Scanner;

public class TasKagıtMakas {
    public static void main(String[] args) {

        int sizPuan = 0;
        int rakipPuan = 0;


        while (sizPuan < 50 && rakipPuan < 50) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen seçiminizi yapınız.\n 1-Taş\n 2-Kağıt\n 3-Makas");
            int secim = scan.nextInt();
            if (secim == 1) {
                System.out.println("Siz : Taş");
            } else if (secim == 2) {
                System.out.println("Siz : Kağıt");
            } else if (secim == 3) {
                System.out.println("Siz: Makas");
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }

            Random rastgele = new Random();
            int rakip = rastgele.nextInt(3);

            switch (rakip) {
                case 0:
                    System.out.println("Rakip: Taş");
                    break;
                case 1:
                    System.out.println("Rakip : Kağıt");
                    break;
                case 2:
                    System.out.println("Rakip : Makas");
                    break;
            }

            if (secim == 1 && rakip == 0) {
                System.out.println("Sizin Puan: " + sizPuan);
                System.out.println("Rakip Puan: " + rakipPuan);
            } else if (secim == 2 && rakip == 1) {
                System.out.println("Sizin Puan: " + sizPuan);
                System.out.println("Rakip Puan: " + rakipPuan);
            } else if (secim == 3 && rakip == 2) {
                System.out.println("Sizin Puan: " + sizPuan);
                System.out.println("Rakip Puan: " + rakipPuan);
            } else if (secim == 1 && rakip == 1) {
                System.out.println("///Kağıt Taşı Sarar///");
                rakipPuan += 10;
                System.out.println("Sizin Puan: " + sizPuan);
                System.out.println("Rakip Puan: " + rakipPuan);
            } else if (secim == 1 && rakip == 2) {
                System.out.println("///Taş Makası Kırar///");
                sizPuan += 10;
                System.out.println("Sizin Puan: " + sizPuan);
                System.out.println("Rakip Puan: " + rakipPuan);
            } else if (secim == 2 && rakip == 0) {
                System.out.println("///Kağıt Taşı Sarar///");
                sizPuan += 10;
                System.out.println("Sizin Puan: " + sizPuan);
                System.out.println("Rakip Puan: " + rakipPuan);
            } else if (secim == 2 && rakip == 2) {
                System.out.println("///Makas Kağıtı Keser///");
                rakipPuan += 10;
                System.out.println("Sizin Puan: " + sizPuan);
                System.out.println("Rakip Puan: " + rakipPuan);
            } else if (secim == 3 && rakip == 0) {
                System.out.println("///Taş Makası Kırar///");
                rakipPuan += 10;
                System.out.println("Sizin Puan: " + sizPuan);
                System.out.println("Rakip Puan: " + rakipPuan);
            } else if (secim == 3 && rakip == 1) {
                System.out.println("///Makas Kağıtı Keser///");
                sizPuan += 10;
                System.out.println("Sizin Puan: " + sizPuan);
                System.out.println("Rakip Puan: " + rakipPuan);
            }

            System.out.println("/////////////////////////////////////////7");


        }
        if (rakipPuan >= 50) {
            System.out.println("KAYBETTİNİZ........");
        } else {
            System.out.println("KAZANDINIZ");
        }
    }
}

    
