
class BinaryFromDecimal {
	public static void main(String[] args)
	{
		int num=120;
		int res=0;
		int a=1;
		while(num>0)
		{
			res=res+(num%2)*a;
			num=num/2;
			a=a*10;
		}
		System.out.println(res);
		
	}

}
