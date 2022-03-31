
import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

      double Armut=2.14 , Elma=3.67 , Domates=1.11 , Muz=0.95, Patlıcan=5.00 ,
              Armutk , Elmak, Domatesk, Muzk,Patlıcank;

      Scanner a = new Scanner(System.in);

        System.out.println("Kac kilo Armut aldin ?");
        Armutk = a.nextDouble();

        System.out.println("Kac kilo Elma aldin");
        Elmak = a.nextDouble();

        System.out.println("Kac kilo Domates aldin");
        Domatesk = a.nextDouble();

        System.out.println("Kac kilo Muz aldin");
        Muzk = a.nextDouble();

        System.out.println("Kac kilo Patlican aldin");
        Patlıcank = a.nextDouble();

        double total = (Elma * Elmak) + (Armut * Armutk) + (Domates * Domatesk) + (Muz * Muzk) + (Patlıcan * Patlıcank);

        System.out.println("Toplam borcunuz =" + total);





    }
}
