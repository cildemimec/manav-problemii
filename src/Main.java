import java.util.Scanner ;

public class Main {
    public static void main (String[] args) {

        double perKgArmut = 2.14 ;
        double perKgElma = 3.67 ;
        double perKgDomates = 1.11 ;
        double perKgMuz =0.95 ;
        double perKgPatlican =5.00 ;

        Scanner scan = new Scanner(System.in);

        System.out.print("lütfen armut miktarını KG cinsinden giriniz :" );
        double armut = scan.nextDouble();

        System.out.print("lütfen elma miktarını KG cinsinden giriniz :" );
        double elma = scan.nextDouble();

        System.out.print("lütfen domates miktarını KG cinsinden giriniz :" );
        double domates = scan.nextDouble();

        System.out.print("lütfen muz miktarını KG cinsinden giriniz :" );
        double muz = scan.nextDouble();

        System.out.print("lütfen patlıcan miktarını KG cinsinden giriniz :" );
        double patlican = scan.nextDouble();

        double  toplamtutar = ((perKgArmut * armut)+ (perKgElma * elma) + (perKgDomates * domates ) +(perKgMuz * muz )+ (perKgPatlican * patlican ));

        System.out.println("Toplam ödenecek tutar :" + toplamtutar);


    }
}
