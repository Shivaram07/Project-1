package basicsofprogrm;
class Login1
{
	void verifylogin()
	{
		System.out.println("enter login details");
	}
}
class Addbenef1 extends Login1
{
	void benef()
	{
		System.out.println("Beneficiary is added");
	}
}

public class TransferFunds extends Addbenef1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransferFunds a= new TransferFunds();
		a.verifylogin();
		a.benef();
		a.tfunds();

	}
void tfunds()
{
	System.out.println("Funds transfered");
}
}
