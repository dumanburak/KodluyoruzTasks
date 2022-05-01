import java.util.Scanner;
public class UsAlma {

	public static void main(String[] args) {
		int sayi, us, total=1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Üssü alýnacak sayýyý giriniz: ");
		sayi = input.nextInt();
		
		System.out.print("Üssü giriniz: ");
		us = input.nextInt();
		
		for (int i = 0; i < us; i++) {
			total *= sayi;
		}
		
		System.out.println("Sonuç: "+ total);
		
		input.close();
	}
}
