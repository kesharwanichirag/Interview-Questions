class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int n=153;
		int m=n;
		int ans=0;
		while(n>0)
		{
			int rem=n%10;
			ans=ans+rem*rem*rem;
			n/=10;
		}
		if(ans==m)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");
	}
}
