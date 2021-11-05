import java.util.Scanner;

public class Main {
    /*     ****Manav Kasa Programı****
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL      */
    public static void main(String[] args) {

        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        double tutar;

        Scanner sc =new Scanner(System.in);

        System.out.print("Armut Kaç Kilo?: ");
        armutKg=sc.nextDouble();

        System.out.print("Elma Kaç Kilo?: ");
        elmaKg=sc.nextDouble();

        System.out.print("Domates Kaç Kilo?: ");
        domatesKg=sc.nextDouble();

        System.out.print("Muz Kaç Kilo?: ");
        muzKg=sc.nextDouble();

        System.out.print("Patlican Kaç Kilo?: ");
        patlicanKg=sc.nextDouble();

        tutar= armutKg*2.14 + elmaKg*3.67 + domatesKg*1.11 + muzKg*0.95 + patlicanKg*5.00;

        System.out.println("\nArmut Kaç Kilo?:"+armutKg+"\nElma Kaç Kilo?: "+elmaKg+
                            "\nDomates Kaç Kilo?: " +domatesKg+"\nMuz Kaç Kilo?: "+muzKg+
                            "\nPatlican Kaç Kilo?: "+patlicanKg+"\nToplam Tutar: "+tutar+"TL");



    }
}
