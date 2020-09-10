
public class toh {

	public static void tof(int n , char s, char h ,char d)
	{
		if(n==1)
		{
			System.out.println("disk "+n+" move from "+s+" to "+d);
			return;
		}
		tof(n-1,s,d,h);
		System.out.println("disk "+n+" move from "+s+" to "+d);
		tof(n-1,h,s,d);
		
	}
	public static void main(String [] args)
	{
		int n=1;
		tof(n,'A','B','C');
	}
}
