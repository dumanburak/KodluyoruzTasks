import java.util.Scanner;
public class KullaniciGirisi {

	public static void main(String[] args) {
		String username = "brkdmn1903", password = "burak123", passwordInput, usernameInput, yeniSifre;
		int sifirla = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullan�c� Ad�n�z: ");
		usernameInput = input.nextLine();
		System.out.print("�ifreniz: ");
		passwordInput = input.nextLine();		
		
		if (username.equals(usernameInput) && password.equals(passwordInput)) {
			System.out.println("Ba�ar�yla giri� yapt�n�z.");
		}
		else {
			System.out.println("Kullan�c� ad� ya da �ifre hatal�.");
			System.out.println("�ifrenizi s�f�rlamak istiyor musunuz?\n 1-Evet \n 2-Hay�r");
			sifirla = input.nextInt();
			
			if (sifirla == 1) {
				Scanner inp = new Scanner(System.in);
				System.out.print("Yeni �ifreyi Giriniz: ");
				yeniSifre = inp.nextLine();
				if (!yeniSifre.equals(password)) { 
					System.out.println("�ifre olu�turuldu.");
				}
				else {
					System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
				}
				inp.close();
			}
			else if (sifirla == 2){
				System.out.println("�ifrenizi s�f�rlamak istemediniz.");
			}
			else {
				System.out.println("Hatal� Giri�");
			}
		}
		input.close();
	}

}
