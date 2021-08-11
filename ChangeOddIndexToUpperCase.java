package week1.day2assignments;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample="hello welcome";
		char[] arr=sample.toCharArray();
         for(int i=0;i<arr.length;i++) {
        	 
			  if(i%2!=0) {
				   
		   System.out.println(Character.toUpperCase(arr[i]));
			  }

	}

}
}