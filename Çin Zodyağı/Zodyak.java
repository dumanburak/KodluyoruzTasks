import java.util.Scanner;
public class Zodyak {

	public static void main(String[] args) {
		int yil,yilMod;
		String zodyak = null;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Doðum Yýlýnýzý Giriniz: ");
		yil = input.nextInt();
		yilMod = yil % 12;
		
		switch (yilMod) {
		case 0:
			zodyak = "Maymun";
			break;
		case 1:
			zodyak = "Horoz";
			break;
		case 2:
			zodyak = "Köpek";
			break;
		case 3:
			zodyak = "Domuz";
			break;
		case 4:
			zodyak = "Fare";
			break;
		case 5:
			zodyak = "Öküz";
			break;
		case 6:
			zodyak = "Kaplan";
			break;
		case 7:
			zodyak = "Tavþan";
			break;
		case 8:
			zodyak = "Ejderha";
			break;
		case 9:
			zodyak = "Yýlan";
			break;
		case 10:
			zodyak = "At";
			break;
		case 11:
			zodyak = "Koyun";
			break;
			
		default:
			System.out.println("Hatalý Giriþ Yaptýnýz!");
		}
		input.close();
		System.out.println("Çin Zodyaðý Burcunuz: "+ zodyak);
	}
}
