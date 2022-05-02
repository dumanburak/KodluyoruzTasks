import java.util.Scanner;

public class DiziElemanlariniSiralama {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int temp;
        int counter = 0;

        System.out.print("Dizinin boyutu n : ");
        int listLength = input.nextInt();
        int[] list = new int[listLength];

        System.out.println("Dizinin elemanlarýný giriniz :");

        for (int i = 1; i <= listLength; i++) {
            System.out.print(i + ". Elemaný : ");
            list[i - 1] = input.nextInt();
        }

        while (counter < list.length) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
            counter++;
        }

        System.out.print("Sýralama : ");
        for (int j : list) {
            System.out.print(j + " ");
        }
        input.close();
        
    }
}
