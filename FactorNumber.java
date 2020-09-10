import java.util.ArrayList;
import java.util.Collections;

public class FactorNumber {
	static int n=20;
	public static ArrayList<Integer> al= new ArrayList<Integer>();
	
	public static void main(String[] args)
	{
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				al.add(new Integer(i));
				if(i!=Math.sqrt(n))
				{
					al.add(new Integer(n/i));
				}
			}
		}
		Collections.sort(al);
		
		for(Integer j : al)
		{
			System.out.println(j);
		}
	}
}
