import java.util.Scanner;
public class Burclar {

	public static void main(String[] args) {
		int month, day;
		String burc = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Doðduðunuz Ay: ");
		month = input.nextInt();
		System.out.print("Doðduðunuz Gün: ");
		day = input.nextInt();
			
		if(month == 1 && (day >= 1 && day <= 31)){
			if(day <= 21)
				burc = "Oðlak";
	        else 
	        	burc = "Kova";
	    }
		
	    else if(month == 2 && (day>=1 && day <= 29)){
	    	if(day <= 19)
	    		burc = "Kova";
	        else
	        	burc = "Balýk";
	        }
		
	    else if(month == 3 && (day>=1 && day <= 31)){
	        if(day <=20)
	        	burc = "Balýk";
	        else 
	        	burc = "Koç";
	        }
		
	    else if(month == 4 && (day>=1 && day <= 30)){
	        if(day <= 20) 
	        	burc = "Koç";
	        else 
	        	burc = "Boða";
	        }
		
	    else if(month == 5 && (day>=1 && day <= 31)){
	        if(day <= 21)
	        	burc = "Boða";
	        else
	        	burc = "Ýkizler";
	        }
		
	    else if(month == 6 && (day>=1 && day <= 30)){
	    	if(day <= 22) 
	    		burc = "Ýkizler";
	        else 
	        	burc = "Yengeç";
	        }
		
	    else if(month == 7 && (day>=1 && day <= 31)){
	        if(day <= 22)
	        	burc = "Yengeç";
	        else
	        	burc = "Aslan";
	        }
		
	    else if(month == 8 && (day>=1 && day <= 31)){
	    	if(day <= 22) 
	    		burc = "Aslan";
	        else 
	        	burc = "Baþak";
	        }
		
	    else if(month == 9 && (day>=1 && day <= 30)){
	        if(day <= 22) 
	        	burc = "Baþak";
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
	        	burc = "Oðlak";
	        }
		
		if (month < 1 || month > 12 || day < 1 || day > 31) {
			System.out.println("Geçersiz Giriþ Yaptýnýz!");
		} else {
			System.out.println("Burcunuz "+burc);
		}
		
		input.close();
	}

}
