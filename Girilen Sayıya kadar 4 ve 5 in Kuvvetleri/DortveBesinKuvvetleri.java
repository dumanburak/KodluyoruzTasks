import java.util.Scanner;;
public class DortveBesinKuvvetleri {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("S�n�r say�s�n� giriniz: ");
		n = input.nextInt();
		System.out.print("Girilen say�ya kadar 4'�n kuvvetleri: 1 ");
		for (int i = 4; i <= n ; i*=4) {
			System.out.print(i+ " ");
		}
		System.out.print("\nGirilen say�ya kadar 5'in kuvvetleri: 1 ");
		for (int j = 5; j <= n; j*=5) {
			System.out.print(j+ " ");
		}
		input.close();
	}

}
