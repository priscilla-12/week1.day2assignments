package week1.day2assignments;

public class ReverseofaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strToRev="Hi Friends";
		char[] strArr=strToRev.toCharArray();
		String strRev=" ";
		for(int x=strArr.length-1;x>=0;x--){
		strRev=strRev+strArr[x];

	}
		System.out.println("The original string is:"+strToRev +"\n");
      System.out.println("The reversed string is:"+strRev);
	}
	
	
		 

}
         