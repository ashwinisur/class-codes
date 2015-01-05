import java.util.*;

public class HW06_AshwiniSuresh_01 {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a hexadecimal: ");
		String input = (in.next()).toUpperCase();
		System.out.println("The decimal value is: " + hexToDecimal(input));
	}
	
	public static int hexToDecimal(String hex)
	{
		int decimalVal = 0; char hexChar;
		for (int i = 0; i < hex.length(); i ++)
		{
			hexChar = hex.charAt(i);
			decimalVal = decimalVal*16 + hexCharToDecimal(hexChar);
		}
		return decimalVal;
	}
	
	public static int hexCharToDecimal(char hexChar)
	{
		int hexInt = Character.getNumericValue(hexChar);
		if (hexInt > 0 && hexInt < 10)
			return hexInt;
		else
		{
			switch (hexChar){
			case 'A':
				return 10;
			case'B':
				return 11;
			case 'C':
				return 12;
			case 'D':
				return 13;
			case 'E':
				return 14;
			case 'F':
				return 15;
			}
			
			return 0;
		}
	}

}
