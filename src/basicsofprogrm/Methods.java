package basicsofprogrm;

public class Methods {

	public static void main(String[] args)
	{
		// TODO Auto-generated method 
Methods a = new Methods();
System.out.println(a.add(10,20));
     }
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	int sub(int a,int b)
	{
		int c=a+b;
		return c;
	}
    void mul(int a,int b)
    {
    	int c=a*b;
    	System.out.println(c);
    }
    void div(int a,int b)
    {
    	int c=a/b;
    	System.out.println(c);
    }
}
