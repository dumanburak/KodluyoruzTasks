import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {
        int kacSayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Ka� tane say� gireceksiniz: ");
        kacSayi = input.nextInt();
        
        int max=0;
        int min=0;
        
        
        for (int i=1; i<=kacSayi; i++)
        {
            System.out.print(i+". say�y� giriniz: ");
            int sayi = input.nextInt();
            
            if (i==1) {  
            	max=sayi;
                min=sayi;
            }          
            
            if (sayi>max)
            	max=sayi;            
            if (sayi<min)
                min=sayi;
        }
        System.out.println("En b�y�k say�: "+max);
        System.out.println("En k���k say�: "+min);
        
        input.close();
    }
}
