import java.util.Arrays;
import java.util.Scanner;

public class DiziEnYakinSayi {

	public static void main(String[] args) {
		
        int[] list = {15,12,788,1,-1,-778,2,0};

        int min = list[0];
        int max = list[0];

        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (min > list[i]) {
                min = list[i];
            }
        }

        Scanner input = new Scanner(System.in);
        int deger;

        String liste = Arrays.toString(list);
        System.out.println("Dizi : " + liste);

        System.out.print("Girilen Sayý : ");
        deger = input.nextInt();

        for (int j : list) {
            if (j > deger) {
                if (j <= max) {
                    max = j;
                }
            }
        }

        for (int j : list) {
            if (j < deger) {
                if (j >= min) {
                    min = j;
                }
            }
        }

        System.out.println("Girilen sayýdan küçük en yakýn sayý : " + min);
        System.out.println("Girilen sayýdan büyük en yakýn sayý : " + max);
        input.close();
    }
}
