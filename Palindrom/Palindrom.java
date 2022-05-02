
public class Palindrom {
	static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
    	String kelime = "abccba";
       	if (isPalindrome(kelime))
       		System.out.println(kelime + " kelimesi palindrom bir kelimedir.");
       	else
       		System.out.println(kelime + " kelimesi palindrom bir kelime deðildir.");
    }
}
