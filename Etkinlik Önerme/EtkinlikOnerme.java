import java.util.Scanner;
public class EtkinlikOnerme {

	public static void main(String[] args) {
		int sicaklik;
		Scanner input = new Scanner(System.in);
		
		System.out.print("S�cakl�k Giriniz: ");
		sicaklik = input.nextInt();

		if (sicaklik < 5)
			System.out.println("Kayak yapabilirsiniz.");
		else if (sicaklik < 15 && sicaklik >= 5 )
			System.out.println("Sinemaya gidebilirsiniz");
		else if (sicaklik < 25 && sicaklik >= 15)
			System.out.println("Pikni�e gidebilirsiniz.");
		else
			System.out.println("Y�zmeye gidebilirsiniz.");
		
		input.close();
	}

}
