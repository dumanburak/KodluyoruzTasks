import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		int n1,n2,selected;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�lk Say�y� Giriniz: ");
		n1 = input.nextInt();
		System.out.print("�kinci Say�y� Giriniz: ");
		n2 = input.nextInt();
		
		System.out.println("\n1-Toplama\n2-��karma\n3-�arpma\n4-B�lme\n");
		System.out.print("Se�iminiz: ");
		selected = input.nextInt();
		
		switch (selected) {
		case 1:
			System.out.println("Toplam�: "+ (n1+n2));
			break;
		case 2:
			System.out.println("Fark�: "+ (n1-n2));
			break;
		case 3:
			System.out.println("�arp�m�: "+ (n1*n2));
			break;
		case 4:
			try {
				System.out.println("B�l�m�: "+ (n1/n2));
				break;
			} catch (Exception e) {
				System.out.println("Bir say� 0'a b�l�nemez!");
				break;
			}
		default:
			System.out.println("Ge�ersiz Giri�!");
			break;
		}
		input.close();
	}
}
