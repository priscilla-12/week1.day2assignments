package week1.day2assignments;
import java.util.Arrays;
public class FindDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] my_arr= {1,2,5,5,6,6,7,2};
   System.out.println("Duplicate elements");
   for (int i=0; i<my_arr.length;  i++)
   {
	for (int j=i+1; j<my_arr.length; j++) 
	{ 
	if(my_arr[i]==my_arr[j])	{
		System.out.println(my_arr[j]);
	}
   }
	}



}
}