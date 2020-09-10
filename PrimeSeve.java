import java.util.ArrayList;

public class PrimeSeve {

	static int n=200;
	static ArrayList al= new ArrayList();
	public static void main(String[] args)
	{
		for(int i=0;i<n;i++)
		{
			al.add(new Integer(1));
		}
		al.set(0, new Integer(0));
		al.set(1, new Integer(0));
		
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			for(int j=2;i*j<n;j++)
			{
				
				int k= i*j;
					al.set(k, new Integer(0));
				
			}
		}
		
		System.out.print(al.get(187));
	}
}
