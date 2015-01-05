import java.util.*;

public class p2 {
	
	public static boolean isPalindrome(String a)
	{
		a = a.toLowerCase();
		int i = 0;
		int j = a.length()-1;
		while(i <= j)
		{
			if(a.charAt(i) != a.charAt(j))
				return false;
			i ++;
			j --;
		}
		return true;
		
	}
	
	public static void main(String[] args)

	{
		if(isPalindrome("Ashwini"))
		{
			System.out.println("Ashwini");
			
		}
		
		if(isPalindrome("kayak"))
		{
			System.out.println("kayak");
		}
	}
}
