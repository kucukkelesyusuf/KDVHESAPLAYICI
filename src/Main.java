import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double tutar, kdvOran1=0.18,kdvOran2=0.08,kdvliTutar,kdvTutar;

        System.out.println("Lütfen bir Tutar giriniz :");
        Scanner input = new Scanner(System.in);

        tutar = input.nextDouble();
        System.out.println("KDV'siz Tutar : " + tutar);
        if(tutar < 1000) {
            kdvTutar = tutar * kdvOran1;
            kdvliTutar = tutar+kdvTutar;
            System.out.println("KDV Oranı : " + kdvOran1);
        }else{
            kdvTutar = tutar * kdvOran2;
            kdvliTutar = tutar+kdvTutar;
            System.out.println("KDV Oranı : " + kdvOran2);
        }

        System.out.println("KDV TUTARI : " + kdvTutar);
        System.out.println("KDV'Li TUTARI : " + kdvliTutar);



    }
}