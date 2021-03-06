import java.util.Arrays;
public class Selection 
{
	//in this intitution we will find the correct index=element-1
	//find the maximum elemen and normal swap the maxindex with last
	//last start with n-i-1
	//getMaxIndex function for finding the max element loop through 
	//start to end take max=arr[start]
	public static void main(String[] args) 
	{
		int [] arr={56,36,234};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void sort(int [] arr)
	{
		for(int i=0;i<arr.length;i++)//their is only one loop normal 0 to length
		{
			int last=arr.length-i-1;//the last is start with the length-i-1
			int maxIndex=getMaxIndex(arr,0,last);
			swap(arr,maxIndex,last);
		}
	}
	static void swap(int [] arr,int start,int end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	static int getMaxIndex(int [] arr,int start,int end)
	{
		int max=start;
		for(int i=start;i<=end;i++)
		{
		 if(arr[max]<arr[i])
			max=i;
		}
		return max;
	}
}
