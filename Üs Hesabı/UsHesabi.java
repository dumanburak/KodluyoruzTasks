import java.util.Scanner;
public class UsHesabi {

	static double usHesabi() {
		int a, b;
		double sonuc;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ss�n al�naca�� say�y� giriniz: ");
		a = input.nextInt();
		
		System.out.print("�ss� giriniz: ");
		b = input.nextInt();
		
		sonuc = Math.pow(a, b);
		input.close();
		System.out.print(a+"^"+b+" Sonu�: ");
		return sonuc;
		
	}
	public static void main(String[] args) {
		System.out.println(usHesabi());
	}
}
