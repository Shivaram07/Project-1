package basicsofprogrm;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b= {1,2,3,4,5};
		int[] a= {5,4,3,2,1};
		int c;
	//	for(int i : a)
  //     System.out.println(i);
		for(int i=0;i<=4;i++)
		{
			for(int j=i+1;j<=4;j++)
			{
				if(a[i]>a[j])
				{
					
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		for(int i:a)
			System.out.print(i);
		for(int i=0;i<=4;i++)
		{
			for(int j=i+1;j<=4;j++)
			{
				if(a[i]<a[j])
				{
					
					c=b[i];
					b[i]=b[j];
					b[j]=c;
				}
			}
		}
		for(int i:b)
			System.out.print(i+"\n");
	}

}
