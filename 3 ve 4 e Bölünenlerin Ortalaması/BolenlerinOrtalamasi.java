import java.util.Scanner;
public class BolenlerinOrtalamasi {

	public static void main(String[] args) {
		double sum = 0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Sayý Giriniz: ");
		int sayi = input.nextInt();
		
		for (int i = 1; i <= sayi; i++) {
			if (i%12 == 0) {
				sum+=i;
				count++;
			}
		}
		input.close();
		System.out.println("Girdiðiniz sayýya kadar hem 3 hem de 4'e tam bölünen sayýlarýn ortalamasý: "+ sum/count);
	}
}
