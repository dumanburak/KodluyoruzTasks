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
			System.out.println("Hatal� giri�, not ortalamaya eklenmedi!");
		}
		
		
		System.out.print("Fizik Notunuz: ");
		fizik = input.nextInt();
		if (fizik>=0 && fizik<=100) {
			ortalama += fizik;
			sayac +=1;
		}
		else {
			System.out.println("Hatal� giri�, not ortalamaya eklenmedi!");
		}
		
		
		System.out.print("T�rk�e Notunuz: ");
		turkce = input.nextInt();
		if (turkce>=0 && turkce<=100) {
			ortalama += turkce;
			sayac +=1;
		}
		else {
			System.out.println("Hatal� giri�, not ortalamaya eklenmedi!");
		}
		
		
		System.out.print("Kimya Notunuz: ");
		kimya = input.nextInt();
		if (kimya>=0 && kimya<=100) {
			ortalama += kimya;
			sayac +=1;
		}
		else {
			System.out.println("Hatal� giri�, not ortalamaya eklenmedi!");
		}
		
		
		System.out.print("M�zik Notunuz: ");
		muzik = input.nextInt();
		if (muzik>=0 && muzik<=100) {
			ortalama += muzik;
			sayac +=1;
		}
		else {
			System.out.println("Hatal� giri�, not ortalamaya eklenmedi!");
		}
		
		
		ortalama = ortalama/(sayac);
		
		if (ortalama <= 55) {
			System.out.println("S�n�fta kald�n�z, seneye g�r���r�z :)");
		}
		else {
			System.out.println("Tebrikler, s�n�f� ge�tiniz!");
		}
		System.out.println("Ortalaman�z: "+ ortalama);
		input.close();
	}

}
