import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("İşlem yapmak istediğiniz iki sayıyı girin");
        System.out.println("Sayı 1:");
        int sayı1=input.nextInt();

        System.out.println("Sayı 2:");
        int sayı2=input.nextInt();

        System.out.println("Hangi işlemi yapmak istediğinizi seçin. \n Toplama için 1 \n Çıkarma için 2 \n Çarpma için 3 \n Bölme için 4");

        int kontrol=input.nextInt();
        float sonuc;

        switch (kontrol){
            case 1:
                sonuc=sayı1+sayı2;
                break;

            case 2:
                sonuc=sayı1-sayı2;
                break;

            case 3:
                sonuc=sayı1*sayı2;
                break;

            case 4:
                sonuc=sayı1/sayı2;
                break;
            default:
                sonuc=0;

        }
        System.out.println("Sonuç="+sonuc);

    }
}