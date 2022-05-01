import java.util.Scanner;
public class Kombinasyon {

	static int faktoriyel(int sayi) {
		int sonuc = 1;
		
		for (int i = 1; i <= sayi; i++) {
			sonuc = sonuc * i;
		}
		return sonuc;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Eleman sayýsýný giriniz: ");
		int sayi = input.nextInt();
		
		System.out.print("Seçim sayýsýný giriniz: ");
		int secim = input.nextInt();
		
		if (sayi<secim || sayi<0 || secim<0)
			System.out.println("Geçersiz Giriþ!");
		else {
			int kombinasyon = faktoriyel(sayi) / (faktoriyel(secim)*(faktoriyel(sayi-secim)));
			
			System.out.println("C("+sayi+","+secim+") = "+kombinasyon);
		}
		
		input.close();
	}
}
