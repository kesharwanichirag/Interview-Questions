//String 
class MaximumOccurance 
{
	public static void main(String[] args) 
	{
		String str="programming";
		int n=str.length();
		System.out.println("Counting the occurance in string: ");
		System.out.println(count(str,n,'n'));
	}
	static int count(String str,int n,char x)
	{
		int k=0;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)==x)
				k++;
		}
		return k;
	}
}
