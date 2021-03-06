public class QuickSort 
{
	//in this sort the main logic is the partition function
	//in this function we will have to perform logic
	//their are two pointer start start with lower_bound
	//and end start with upper_bound
	//simply pivot element is nothing but the first element in the array
	//checking the start element always smaller than pivot increment the start pointer
	//checking the end element always greater than pivot than decrement the end pointer
	public static void main(String[] args) 
	{
		int [] arr={34,523,2,5};
		int n=arr.length;
		System.out.println("Array before sorting: ");
		printArray(arr,n);
        System.out.println("Array after sorting: ");
		quicksort(arr,0,n-1);
		printArray(arr,n);
	}
	static void quicksort(int [] arr,int start,int end)
	{
		int pivot=0;
		if(start<end)
		{
			pivot=partition(arr,start,end);
			quicksort(arr,start,pivot-1);
			quicksort(arr,pivot+1,end);
		}
	}
	static int partition(int [] arr,int lb,int ub)
	{
		int start=lb;
		int end=ub;
		int pivot=arr[lb];
		while(start<end)
		{
			while(arr[start]<pivot)start++;
			while(arr[end]>pivot)end--;
			if(start<end)
			{
				swap(arr,start,end);
			}
		}
		swap(arr,end,start);
		return end;
	}
	static void swap(int [] arr,int start,int end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	static void printArray(int [] arr,int size)
	{
		int i;
		for(i=0;i<size;i++)
			System.out.println(arr[i]);
	}
}
