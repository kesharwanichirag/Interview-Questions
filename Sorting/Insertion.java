import java.util.Arrays;
public class Insertion 
{
	//simlar as bubble sort comparison but only difference is we will 
	//have to sort in lhs
	//i->i-2 start with length
	//j->reverse of i+1 and having the reverse element
	//swap the element if condition of a[j]<a[j-1] simply swap 
	//otherwise come out and break the condition
	//swapping is less as compare to bubble sorting algorithm
	public static void main(String[] args) 
	{
		int [] arr={45,23,2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void sort(int [] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					swap(arr,j,j-1);
					
				}
				else
				{
					break;

				}
			}
		}
	}
	static void swap(int [] arr,int start,int end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
}
