import java.util.Scanner;
public class Burclar {

	public static void main(String[] args) {
		int month, day;
		String burc = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Do�du�unuz Ay: ");
		month = input.nextInt();
		System.out.print("Do�du�unuz G�n: ");
		day = input.nextInt();
			
		if(month == 1 && (day >= 1 && day <= 31)){
			if(day <= 21)
				burc = "O�lak";
	        else 
	        	burc = "Kova";
	    }
		
	    else if(month == 2 && (day>=1 && day <= 29)){
	    	if(day <= 19)
	    		burc = "Kova";
	        else
	        	burc = "Bal�k";
	        }
		
	    else if(month == 3 && (day>=1 && day <= 31)){
	        if(day <=20)
	        	burc = "Bal�k";
	        else 
	        	burc = "Ko�";
	        }
		
	    else if(month == 4 && (day>=1 && day <= 30)){
	        if(day <= 20) 
	        	burc = "Ko�";
	        else 
	        	burc = "Bo�a";
	        }
		
	    else if(month == 5 && (day>=1 && day <= 31)){
	        if(day <= 21)
	        	burc = "Bo�a";
	        else
	        	burc = "�kizler";
	        }
		
	    else if(month == 6 && (day>=1 && day <= 30)){
	    	if(day <= 22) 
	    		burc = "�kizler";
	        else 
	        	burc = "Yenge�";
	        }
		
	    else if(month == 7 && (day>=1 && day <= 31)){
	        if(day <= 22)
	        	burc = "Yenge�";
	        else
	        	burc = "Aslan";
	        }
		
	    else if(month == 8 && (day>=1 && day <= 31)){
	    	if(day <= 22) 
	    		burc = "Aslan";
	        else 
	        	burc = "Ba�ak";
	        }
		
	    else if(month == 9 && (day>=1 && day <= 30)){
	        if(day <= 22) 
	        	burc = "Ba�ak";
	        else 
	        	burc = "Terazi";
	        }
		
	    else if(month == 10 && (day>=1 && day <= 31)){
	        if(day <= 22)
	        	burc = "Terazi";
	        else 
	        	burc = "Akrep";
	        }
		
	    else if(month == 11 && (day>=1 && day <= 30)){
	        if(day <= 21)
	        	burc = "Akrep";
	        else 
	        	burc = "Yay";
	        }
		
	    else if(month == 12 && (day>=1 && day <= 31)){
	        if(day <= 21)
	        	burc = "Yay";
	        else
	        	burc = "O�lak";
	        }
		
		if (month < 1 || month > 12 || day < 1 || day > 31) {
			System.out.println("Ge�ersiz Giri� Yapt�n�z!");
		} else {
			System.out.println("Burcunuz "+burc);
		}
		
		input.close();
	}

}
