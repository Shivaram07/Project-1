package basicsofprogrm;

public class Polysub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Polysub a =new Polysub();
System.out.println(a.add(13,14));
System.out.println (a.add(10.5,11.5));
System.out.println(a.add(12.55, 13.33,14.55));
	}
int add(int x,int y)
{
	return(x-y);
}
double add(double x,double y)
{
	return(x-y);
}
double add(double x,double y,double z)
{
	return(x-y-z);
}
}
