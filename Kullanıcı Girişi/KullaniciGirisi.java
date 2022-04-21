import java.util.Scanner;
public class KullaniciGirisi {

	public static void main(String[] args) {
		String username = "brkdmn1903", password = "burak123", passwordInput, usernameInput, yeniSifre;
		int sifirla = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanýcý Adýnýz: ");
		usernameInput = input.nextLine();
		System.out.print("Þifreniz: ");
		passwordInput = input.nextLine();		
		
		if (username.equals(usernameInput) && password.equals(passwordInput)) {
			System.out.println("Baþarýyla giriþ yaptýnýz.");
		}
		else {
			System.out.println("Kullanýcý adý ya da þifre hatalý.");
			System.out.println("Þifrenizi sýfýrlamak istiyor musunuz?\n 1-Evet \n 2-Hayýr");
			sifirla = input.nextInt();
			
			if (sifirla == 1) {
				Scanner inp = new Scanner(System.in);
				System.out.print("Yeni Þifreyi Giriniz: ");
				yeniSifre = inp.nextLine();
				if (!yeniSifre.equals(password)) { 
					System.out.println("Þifre oluþturuldu.");
				}
				else {
					System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
				}
				inp.close();
			}
			else if (sifirla == 2){
				System.out.println("Þifrenizi sýfýrlamak istemediniz.");
			}
			else {
				System.out.println("Hatalý Giriþ");
			}
		}
		input.close();
	}

}
