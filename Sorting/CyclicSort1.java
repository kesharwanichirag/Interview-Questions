import java.util.Arrays;
public class CyclicSort1 
{
	public static void main(String[] args) 
	{
		int [] nums={3,0,1};
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}
	static int sort(int [] arr)
	{
		int i=0;
		int n=arr.length;
		while(i<n)
		{
			int correct=arr[i];
			if(arr[i]<n && arr[i]!=arr[correct])
			{
				swap(arr,i,correct);
			}
			else
			{
				i++;
			}
		}
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]!=index)
			{
				return index;
			}
		}
		return arr.length;
	}
	static void swap(int [] arr,int first ,int second)
	{
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}
