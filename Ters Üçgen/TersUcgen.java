import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Basamak Say�s�: ");
        int sayi = input.nextInt();
        
        for(int i=0;i<sayi;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }   
            for(int k=2*sayi-1; k>=(2*i+1); k--){
                System.out.print("*");
            }
                System.out.println();   
        }
        input.close();
    }
}