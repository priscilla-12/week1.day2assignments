package week1.day2assignments;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String x ="hai ";
      String rev=" ";
      int l = x.length();
      for(int y=l-1; y>=0 ; y--)
      {
    	  rev=rev+x.charAt(y);
      }
      if(x.equalsIgnoreCase(rev))
      {
      System.out.println("the given string is palindrome");
      
      }
      else
      System.out.println("the given string is not palindrome");
      
	}

}

