package basicsofprogrm;

public class Empdetailc {
	String empname;
	double empid;
	double sal;
	String designation;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empdetailc e1=new Empdetailc("Shiva", 13135, 35000, "Trainee software eng");
		e1.display();
		Empdetailc e2=new Empdetailc("Ram", 13136, 45000, "Software eng");
		e2.display();
		Empdetailc e3=new Empdetailc("jack", 13137, 55000, "Senior software eng");
		e3.display();
		

	}
	 Empdetailc(String a,double b,double c,String d)
	{
		empname=a;
		empid=b;
		sal=c;
		designation=d;
				
	}
	void display()
	{
		System.out.println("Employee name :"+empname);
		System.out.println("Emp id        :"+empid);
		System.out.println("Salary        :"+sal);
		System.out.println("Designation   :"+designation);
		System.out.println("-----------------------------------");
	}

}
