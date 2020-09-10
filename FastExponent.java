
public class FastExponent {
	public static int pow (int a, int b )
	{
		if(b==0) return 1;
		if(b==1) return a;
		
		int R= pow(a,(int)(b/2));
		
		if(b%2==0)
		{
			return R*R;
		}
		else
		{
			return (R*a*R);
		}
	}
	public static void main(String[] args)
	{
		int n=101;
		int x=4;
		int z= pow(n,x);
		System.out.print(z);
	}

}
