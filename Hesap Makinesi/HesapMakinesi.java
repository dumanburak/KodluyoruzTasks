import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		int n1,n2,selected;
		Scanner input = new Scanner(System.in);
		
		System.out.print("İlk Sayıyı Giriniz: ");
		n1 = input.nextInt();
		System.out.print("İkinci Sayıyı Giriniz: ");
		n2 = input.nextInt();
		
		System.out.println("\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
		System.out.print("Seçiminiz: ");
		selected = input.nextInt();
		
		switch (selected) {
		case 1:
			System.out.println("Toplamı: "+ (n1+n2));
			break;
		case 2:
			System.out.println("Farkı: "+ (n1-n2));
			break;
		case 3:
			System.out.println("Çarpımı: "+ (n1*n2));
			break;
		case 4:
			try {
				System.out.println("Bölümü: "+ (n1/n2));
				break;
			} catch (Exception e) {
				System.out.println("Bir sayı 0'a bölünemez!");
				break;
			}
		default:
			System.out.println("Geçersiz Giriş!");
			break;
		}
		input.close();
	}
}
