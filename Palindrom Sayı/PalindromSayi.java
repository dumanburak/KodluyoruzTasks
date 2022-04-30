import java.util.Scanner;
public class PalindromSayi {
	 static boolean isPalindrom(int number) {
        int temp = number;
        int reverseNumber = 0;
        int mod;
        
        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Sayı Giriniz: ");
    	int number = input.nextInt();
    	
        if (isPalindrom(number) == true)
        	System.out.println("Girdiğiniz sayı palindrom bir sayıdır.");
        else
        	System.out.println("Girdiğiniz sayı palindrom bir sayı değildir.");
        input.close();
    }
}
