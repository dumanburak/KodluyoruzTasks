import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int sayi, n1 = 0, n2 = 1, toplam;
		Scanner input = new Scanner(System.in);
		System.out.print("Fibonacci diziniz kaç elemanlý olsun? : ");
		sayi = input.nextInt();
		
		if (sayi<=0)
			System.out.println("Geçersiz Giriþ!");
		else {
			System.out.print(sayi + " Elemanlý Fibonacci Serisi: "+ n1 +" "+ n2);
			for (int i = 2; i < sayi; i++) {
				toplam = n1 + n2;
				System.out.print(" "+ toplam);
				
				n1 = n2;
				n2 = toplam;
			}
		}
		input.close();
	}
}
