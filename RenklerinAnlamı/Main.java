import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner klavye = new Scanner(System.in);
	//String renk;

	System.out.println("En sevdiğiniz rengi klavyeden giriniz:");
	String renk = klavye.next();
	renk= renk.toLowerCase();

        System.out.println("Bu rengin anlamı:");

	switch (renk)
    {
        case "kırmızı":
            System.out.println("İrade, hırs, tutku ve enerji ile ilişkilendirilir.");
            break;

        case "mavi":
            System.out.println("Sabit ilkeleri ve değerleri olan insanları yansıtır. Bu tür insanlar, bu değerler ölçüsünde yaşamlarını sürdürme eğilimindedir.");
            break;

        case "sarı":
            System.out.println("Hayal kurmanın ve mükemmeliyetçiliğin göstergesidir.");
            break;

        case "yeşil":
            System.out.println("Bu rengi seven insanlar güvende hissetmek ve itibar sahibi olmak isterler.");
            break;

        case "turuncu":
            System.out.println("Bu renk başkalarıyla ilişki kurmaya ve onlarla vakit geçirmeye istekli olan kişilerce tercih edilir.");
            break;

        case "siyah":
            System.out.println("İrade sahibi olmakla ve bağımsızlıkla ilişkilendirilir.");
            break;

        case "kahverengi":
            System.out.println("Basit bir hayatı arzulamakla ve güçlü arkadaşlık bağları kurmakla ilişkilendirilir.");
            break;

        case "beyaz":
            System.out.println("Bu rengi tercih eden kişiler hayatlarında basitlik, açık sözlülük ve saflık arar.");
            break;

        default:
            System.out.println("bulunamıyor.");
            break;



    }







    }
}
