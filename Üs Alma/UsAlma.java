import java.util.Scanner;
public class UsAlma {

	public static void main(String[] args) {
		int sayi, us, total=1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ss� al�nacak say�y� giriniz: ");
		sayi = input.nextInt();
		
		System.out.print("�ss� giriniz: ");
		us = input.nextInt();
		
		for (int i = 0; i < us; i++) {
			total *= sayi;
		}
		
		System.out.println("Sonu�: "+ total);
		
		input.close();
	}
}
