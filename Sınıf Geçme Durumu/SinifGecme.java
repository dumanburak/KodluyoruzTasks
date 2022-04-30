import java.util.Scanner;
public class SinifGecme {

	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik;
		double ortalama = 0;
		int sayac = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik Notunuz: ");
		mat = input.nextInt();
		if (mat>=0 && mat<=100) {
			ortalama += mat;
			sayac += 1;
		}
		else {
			System.out.println("Hatalý giriþ, not ortalamaya eklenmedi!");
		}
		
		
		System.out.print("Fizik Notunuz: ");
		fizik = input.nextInt();
		if (fizik>=0 && fizik<=100) {
			ortalama += fizik;
			sayac +=1;
		}
		else {
			System.out.println("Hatalý giriþ, not ortalamaya eklenmedi!");
		}
		
		
		System.out.print("Türkçe Notunuz: ");
		turkce = input.nextInt();
		if (turkce>=0 && turkce<=100) {
			ortalama += turkce;
			sayac +=1;
		}
		else {
			System.out.println("Hatalý giriþ, not ortalamaya eklenmedi!");
		}
		
		
		System.out.print("Kimya Notunuz: ");
		kimya = input.nextInt();
		if (kimya>=0 && kimya<=100) {
			ortalama += kimya;
			sayac +=1;
		}
		else {
			System.out.println("Hatalý giriþ, not ortalamaya eklenmedi!");
		}
		
		
		System.out.print("Müzik Notunuz: ");
		muzik = input.nextInt();
		if (muzik>=0 && muzik<=100) {
			ortalama += muzik;
			sayac +=1;
		}
		else {
			System.out.println("Hatalý giriþ, not ortalamaya eklenmedi!");
		}
		
		
		ortalama = ortalama/(sayac);
		
		if (ortalama <= 55) {
			System.out.println("Sýnýfta kaldýnýz, seneye görüþürüz :)");
		}
		else {
			System.out.println("Tebrikler, sýnýfý geçtiniz!");
		}
		System.out.println("Ortalamanýz: "+ ortalama);
		input.close();
	}

}
