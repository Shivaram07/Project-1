package javaoops;

public class Static1 {
	static String empname;
	static int empid;
	static double sal;
	static String designation;
	static String clgname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("default main");
        display("Ram",3,55000,"Manager","CVN");

	}

	static void display(String a,int b,double c,String d,String e)
	
	{
		empname=a;
	    empid=b;
	    sal=c;
	    designation=d;
	    clgname=e;
	    
	System.out.println("Employee name :"+empname);
	System.out.println("Emp id        :"+empid);
	System.out.println("Salary        :"+sal);
	System.out.println("Designation   :"+designation);
	System.out.println("college name  :"+clgname);
	System.out.println("-----------------------------------");
		
	}
	
	static
	
	{
		
     String empname="Shiva";
	 int empid=1;
	 double sal=35000;
	 String designation="Trianee";
	 String clgname="CVN";
	 
        System.out.println("static block starts");
		System.out.println("Employee name :"+empname);
		System.out.println("Emp id        :"+empid);
		System.out.println("Salary        :"+sal);
		System.out.println("Designation   :"+designation);
		System.out.println("college name  :"+clgname);
		display("Shivaram",2,45000,"Senior eng","CVN");
		System.out.println("static block ends");
		System.out.println("-----------------------------------");
		
	}
}
