
public class Kadanes_algo {

	public static void main(String[] args)
	{
		int[] arr= {-2,-5,6,-2,-3,1,5,-6};
		int cs=0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			cs=cs+arr[i];
			if(cs<0) cs=0;
			if(max<cs) max=cs;
			
					
		}
		
		System.out.println(max);
	}
}
