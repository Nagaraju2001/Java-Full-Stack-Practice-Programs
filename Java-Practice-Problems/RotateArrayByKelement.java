package Problems;

public class RotateArrayByKelement {

	public static int[] reverse(int arr[],int k, int n)
	{
		k = k % n;
		
		for(int i=0; i<n;i++)
		{
			if(i < k)
			{
				System.out.print(arr[n+i-k]+" ");
			}
			else
			{
				System.out.print(arr[i-k]+" ");
			}
		}
		
		
		return arr;
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		int k = 3;
		
		int[] res = reverse(arr,k,arr.length);
	}

}
