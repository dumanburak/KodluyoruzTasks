import java.util.Scanner;
public class DeseneGoreMetot {
	static void cikar(int sayi,int tut){
        System.out.print(tut+" ");
        if (tut <= 0){
            ekle(sayi, tut+5);
        }
        else{
            cikar(sayi, tut-5);
        }
    }
    static void ekle(int sayi, int tut){
        System.out.print(tut + " ");
        if (sayi == tut)
            return;
        else{
            ekle(sayi, tut+5);
        }
    }

    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("N degerini giriniz : ");
        sayi = input.nextInt();
        System.out.print("Çýktýsý : ");
        cikar(sayi, sayi);
        input.close();
    }
}
