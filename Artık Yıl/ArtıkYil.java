import java.util.Scanner;
public class ArtýkYil {

	public static void main(String[] args) {
		int yil;
		boolean artikYil;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Yýl Giriniz: ");
		yil = input.nextInt();
		
		if (yil%4==0) {
			if (yil%100==0) {
				if (yil%400==0) 
					artikYil = true;
				else
					artikYil = false;
			}
			else
				artikYil = true;
		}
		else
			artikYil = false;
		
		input.close();
		
		if (artikYil == true)
			System.out.println(yil +" bir artýk yýldýr !");
		else
			System.out.println(yil + " bir artýk yýl deðildir !");
	}
}
