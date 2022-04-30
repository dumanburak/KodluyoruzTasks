import java.util.Scanner;
public class UsHesabi {

	static double usHesabi() {
		int a, b;
		double sonuc;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Üssün alýnacaðý sayýyý giriniz: ");
		a = input.nextInt();
		
		System.out.print("Üssü giriniz: ");
		b = input.nextInt();
		
		sonuc = Math.pow(a, b);
		input.close();
		System.out.print(a+"^"+b+" Sonuç: ");
		return sonuc;
		
	}
	public static void main(String[] args) {
		System.out.println(usHesabi());
	}
}
