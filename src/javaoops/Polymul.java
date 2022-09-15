package javaoops;

public class Polymul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Polymul a =new Polymul();
System.out.println(a.add(13,14));
System.out.println (a.add(10.5f,11.5f));
System.out.println(a.add(12.55, 13.33,14.55));
	}
int add(int x,int y)
{
	return(x*y);
}
float add(float x,float y)
{
	return(x*y);
}
double add(double x,double y,double z)
{
	return(x*y*z);
}
}
