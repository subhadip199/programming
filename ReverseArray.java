
public class ReverseArray {

	public static void main(String[] args)
	{
		int n=5;
		int[] arr= {21,45,75,98,72};
		int i=0;
		int j=n-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]= arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for( i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
