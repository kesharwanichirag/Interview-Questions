import java.util.Arrays;
public class String5 
{
	//sorting the alphabet 
	public static void main(String[] args) 
	{
	    String str="rock";
		char temp;
        char [] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(new String (arr));




		char [] arr2=str.toCharArray();
		Arrays.sort(arr2);
		System.out.println(arr2);
	}
}
