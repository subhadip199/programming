import java.util.*;
public class PrimeFactor {

	public static void main(String[] args)
	{   
		int num=5;
		/* int i=2;
		while(num!=1)
		{
			while(num%i!=0)
			{
				i++;
			}
			System.out.println(i);
			num=num/i;
		}*/
		
		for(int j=2;j<Math.sqrt(num);j++)
		{
			if(num%j==0) {
				
			int c=0;
			while(num%j==0)
			{
				c++;
				num=num/j;
			}
			
			System.out.println(j+" no of time :"+c);
			}
		}
		if(num!=1)System.out.println(num+" no of time :"+1);
	}
}
