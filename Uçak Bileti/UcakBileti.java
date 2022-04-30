import java.util.Scanner;
public class UcakBileti {

	public static void main(String[] args) {
		int mesafe, yas, tip;
		double tutar;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden giriniz: ");
		mesafe = input.nextInt();
		
		System.out.print("Yaþýnýzý giriniz: ");
		yas = input.nextInt();
		
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ): ");
		tip = input.nextInt();
		
		if (mesafe<1 || yas<1 || !(tip<=2 && tip>=1)) {
			System.out.println("Hatalý Veri Girdiniz !");
		}
		else {
			tutar = mesafe * 0.1; 
			
			if (yas<12) 
				tutar /= 2;
			else if (yas>=12 && yas < 24) 
				tutar -= tutar*0.1;
			else if (yas >= 65)
				tutar -= tutar*0.3;
			
			if (tip == 2) {
				tutar -= tutar*0.2;
				tutar *=2 ;
			}
			System.out.println("\nToplam Tutar = "+ tutar + " TL");
		}
		input.close();
	}
}
