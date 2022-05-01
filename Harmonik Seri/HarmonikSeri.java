import java.util.Scanner;

public class HarmonikSeri {

	public static void main(String[] args) {
		double sayi, sonuc = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("N sayýsýný giriniz : ");
        sayi = input.nextInt();
        
        while (sayi > 0) {
            sonuc += (1 / sayi);
            sayi--;
        }

        input.close();
        System.out.println("Sonuç = "+sonuc);
    }
}
