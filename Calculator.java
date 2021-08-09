package week1.day2assignments;

public class Calculator {
	public int add()
	{
		int x=1, y=2;
		int z=x+y;
		return z;
	}
    public int sub()
    {
    	int a=30,  b=10;
    	int c=a-b;
    	return c;
    }
    public int mul()
    {
    	int p=5, q=3;
    	int r=p*q;
    	return r;
    }
    public int div()
    {
    	int i=20, j=2;
    	int k=i/j;
    	return k;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculator cal = new Calculator();
   
    int add = cal.add();
    System.out.println("add =" +add);
    
    int sub = cal.sub();
    System.out.println("sub =" +sub);
    
    int mul = cal.mul(); 
    System.out.println("mul =" +mul);
    
    int div = cal.div();
    System.out.println("div =" +div);
	}
    
    
	}


