
public class RotateArray {

	static int [] arr= { 5,20,45,87,95};
	static int n=5;
	public static void rotate()
	{
		int i=0;
		int x= arr[0];
		for( i=1;i<n;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[i-1]=x;
	}
	public static void main(String[] args)
	{
		int d=2;
		for(int i=0;i<d;i++)
		{
			rotate();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}
