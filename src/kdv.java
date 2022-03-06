import java.util.Scanner;
public class kdv {

    public static void main(String[] args) {
        double tutar,kdvoran=0.18;
         Scanner input= new Scanner(System.in);
          System.out.print("Tutari gir: ");
           tutar= input.nextDouble();//
            Double kdvtutar= tutar*kdvoran;
             double kdvlitoplam=tutar+kdvtutar;
              System.out.println(kdvlitoplam);

       System.out.println("*******************");

        System.out.println("Fiyat : "+tutar);
         System.out.println("KDV(%) : "+"%"+kdvoran);
          System.out.println("KDV Fiyat : "+kdvtutar);
           System.out.print("KDVLİ Tutar : "+kdvlitoplam);

    }
}
