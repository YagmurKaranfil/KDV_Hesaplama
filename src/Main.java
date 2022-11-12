import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double tutar , kdvOrani, kdvTutari , kdvliTutar;


        Scanner input=new Scanner(System.in);
        System.out.print("Tutar giriniz : ");
        tutar=input.nextDouble();

        kdvOrani=(tutar>0 && tutar<1000)?0.18 : 0.08;

        kdvTutari=tutar*kdvOrani;
        kdvliTutar=tutar+kdvTutari;


        System.out.println("KDV Oranı : " + kdvOrani);
        System.out.println("KDV Tutarı : " + kdvTutari);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
    }
}