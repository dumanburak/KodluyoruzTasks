import java.util.Scanner;

public class AsalSayi {
	
	private static int isPrime(int num, int i) {
		 if (i==1){
			 return 1;
	     }else {
	    	 if (num%i==0){
	    		 return 0;
	    	 }
	    	 else return isPrime(num,i-1);
	     }
	 }
	
	public static void main(String[] args) {
		 
		int num, prime ;
		Scanner input=new Scanner(System.in);
		System.out.print("Pozitif bir tamsayý giriniz : ");
		num= input.nextInt();

		prime=isPrime(num,num/2);

		if (prime==1){
			System.out.println(num+" sayýsý asaldýr");
		}else {
			System.out.println(num+" sayýsý asal deðildir");
		}
		input.close();
	}
}
