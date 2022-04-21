import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		int n1,n2,selected;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ýlk Sayýyý Giriniz: ");
		n1 = input.nextInt();
		System.out.print("Ýkinci Sayýyý Giriniz: ");
		n2 = input.nextInt();
		
		System.out.println("\n1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme\n");
		System.out.print("Seçiminiz: ");
		selected = input.nextInt();
		
		switch (selected) {
		case 1:
			System.out.println("Toplamý: "+ (n1+n2));
			break;
		case 2:
			System.out.println("Farký: "+ (n1-n2));
			break;
		case 3:
			System.out.println("Çarpýmý: "+ (n1*n2));
			break;
		case 4:
			try {
				System.out.println("Bölümü: "+ (n1/n2));
				break;
			} catch (Exception e) {
				System.out.println("Bir sayý 0'a bölünemez!");
				break;
			}
		default:
			System.out.println("Geçersiz Giriþ!");
			break;
		}
		input.close();
	}
}
