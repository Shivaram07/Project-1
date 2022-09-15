package basicsofprogrm;
import java.util.Arrays;
public class Swapstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char tmp;


char d[]= {'s','h','i','v','a'};
int c =d.length;
for(int i=0;i<=c-1;i++)
{
	for(int j=i+1;j<=c-1;j++)
	{
	if(d[i]>d[j])
	{
		tmp=d[i];
		d[i]=d[j];
		d[j]=tmp;
	}
	
	}
}for(int i=0;i<=c;i++)
System.out.println(d[i]);
	}

}
