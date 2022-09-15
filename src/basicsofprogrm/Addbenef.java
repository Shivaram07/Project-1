package basicsofprogrm;
class Login
{
	void verifylogin()
	{
		System.out.println("enter login details");
	}
}
public class Addbenef extends Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addbenef a= new Addbenef();
  a.verifylogin();
  a.benef();
	}
 void benef()
 {
	 System.out.println("Beneficiary is added");
 }
}
