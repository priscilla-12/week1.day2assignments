package week1.day2assignments;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String str = "God is Good";
		
		int count = 0;
		char strArr[] = str.toCharArray();
		for (int i=0;i<strArr.length;i++) {
			if(strArr[i] == 'o') {
			count++;
		}
		System.out.println(count);
	}

}
}