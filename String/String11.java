public class String11 
{
	//Count the number of words
	public static void main(String[] args) 
	{
		String str=" abc def gh ijk";
		str=str.replaceAll("\\s"," ").trim();
		String [] words=str.split("\\s");
		System.out.println("Number of words in string is: ");
		System.out.println(words.length);
	}
}
