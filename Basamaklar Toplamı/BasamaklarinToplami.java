import java.util.Scanner;
public class BasamaklarinToplami {

	public static void main(String[] args) {
		int sayi , total = 0, temp, temp2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Say� giriniz: ");
		sayi = input.nextInt();
		temp2 = sayi;
		
		while (sayi > 0) {
			temp = sayi%10; //3, 6, 4, 2
			
			total += temp;
			sayi /=10;
		}
		
		input.close();
		
		System.out.println(temp2 + " say�s�n�n basamaklar�n�n toplam� = "+ total);
	}
}
