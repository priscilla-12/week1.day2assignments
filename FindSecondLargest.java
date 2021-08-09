package week1.day2assignments;
import java.util.Arrays;
public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num[] = {85,93,46,32,29,56};
    int n=num.length;
    Arrays.sort(num);
    System.out.println("Find Second Largest Element:" +num[n-2]);
    
    
	}

}
