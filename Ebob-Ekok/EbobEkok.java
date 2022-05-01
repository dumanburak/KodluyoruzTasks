import java.util.Scanner;
public class EbobEkok {

	public static void main(String[] args) {
		int sayi1,sayi2,sayi3,sayi4, ebob = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("EBOB Ýþlemi:\n");
		System.out.print("1.Sayýyý Giriniz: ");
		sayi1 = input.nextInt();
		
		System.out.print("2.Sayýyý Giriniz: ");
		sayi2 = input.nextInt();
		
		int i = sayi1;
		while (i>=1) {
			if (sayi1%i==0 && sayi2%i==0) {
				ebob = i;
				System.out.println("EBOB("+sayi1+","+sayi2+") = "+ebob);
				break;
			}
			i--;
		}
		
		System.out.println("\nEKOK Ýþlemi:\n");
		System.out.print("1.Sayýyý Giriniz: ");
		sayi3 = input.nextInt();
		
		System.out.print("2.Sayýyý Giriniz: ");
		sayi4 = input.nextInt();
		
		int j = 1;
		while (j<= sayi3*sayi4) {
			if (j%sayi3==0 && j%sayi4==0) {
				System.out.println("EKOK("+sayi3+","+sayi4+") = "+j);
				break;
			}
			j++;
		}
		
		input.close();
	}

}
