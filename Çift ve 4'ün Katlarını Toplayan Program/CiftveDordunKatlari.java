import java.util.Scanner;
public class CiftveDordunKatlari {

	public static void main(String[] args) {
		int n = 0, total = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Sayý Giriniz: ");
			n = input.nextInt();
			
			if (n%2==0 && n%4==0 && n>=0)
				total+=n;
		}while (n%2==0);
			
		System.out.println(total);
		input.close();
	}

}
