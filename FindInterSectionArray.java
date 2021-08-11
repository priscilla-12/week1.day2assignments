package week1.day2assignments;

public class FindInterSectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray1[] = {21,22,23,24,45,65,91};
		int myArray2[] = {45,24,91,87,52,23,15};
		
		for(int i=0;i<myArray1.length;i++ )
		{
			for(int j=0;j<myArray1.length;j++ )
			{
		if(myArray1[i]==myArray2[j]) {
			
		System.out.println(myArray2[j]);	
		}
			
			
			}
	
}
}
	}
	