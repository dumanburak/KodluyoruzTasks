import java.util.Arrays;

public class DiziElemanlarininFrekansi {

	public static void main(String[] args) {
		int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
		Arrays.sort(dizi);
		System.out.println("Dizi : "+Arrays.toString(dizi));
		System.out.println("Tekrar Sayýlarý");
	
		for(int i = 0; i < dizi.length; i++) {
			int counter = 0;
			for(int j = 0; j < dizi.length; j++) {
				if(dizi[i] == dizi[j]) {
					counter++;	
				}	
			}
			System.out.println(dizi[i] + " sayisi " + counter + " kere tekrar edildi.");
			i += counter-1;
		}
	}
}
