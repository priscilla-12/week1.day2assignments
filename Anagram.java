package week1.day2assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Race";
		String str2 = "Care";
		
		//check length is same
		if(str1.length() == str2.length())
		{
		
			//convert string to char array
		char[] charArray1 = str1.toCharArray();
	    char[] charArray2 = str2.toCharArray();
	    
	    //sort the char array
	    Arrays.sort(charArray1);	
		Arrays.sort(charArray2);
		
		if (Arrays.equals(charArray1,charArray2)) 
				{
			System.out.println("Both are anagram");
			
		}else
			System.out.println("Both are not anagram");
		
		}
	}
}