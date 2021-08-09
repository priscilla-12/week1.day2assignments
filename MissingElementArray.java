package week1.day2assignments;
import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    int[] arr = {0,2,3,4,5,6,7,8};
    for (int i = 0; i < arr.length; i++) {
    	if(arr[i] != i)
    	{
    		System.out.println("Missing Element Array :" + i);
    		break;
    	}
    }
	}

}
