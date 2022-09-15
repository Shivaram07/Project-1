package basicsofprogrm;

public class Empdetail {
	String empname;
	double empid;
	double sal;
	String designation;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empdetail e1=new Empdetail();
		e1.enter("Shiva", 13135, 35000, "Trainee software eng");
		e1.display();
		Empdetail e2=new Empdetail();
		e2.enter("Ram", 13136, 45000, "Software eng");
		e2.display();
		Empdetail e3=new Empdetail();
		e3.enter("jack", 13137, 55000, "Senior software eng");
		e3.display();
		

	}
	void enter(String a,double b,double c,String d)
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
