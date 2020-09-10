import java.util.HashMap;

public class Fibonacci {
	public static HashMap<Integer,Integer> mp = new HashMap();
	public static Integer Fib(int n)
	{
		if(n==0) {mp.put(n, n); return n ;}
		if(n==1) {mp.put(n, n); return n ;}
		
		if(mp.containsKey(n))
		{
			return mp.get(n);
		}
		else
		{
			Integer x= Fib(n-1)+Fib(n-2);
			mp.put(n, x);
			return x;
		}
	}
	public static void main(String[] args)
	{
		int n=40;
		int a= Fib(n);
		System.out.print(a);
	}

}
