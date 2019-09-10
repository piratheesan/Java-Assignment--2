public class Q7
{
	public static void main (String[] args)
	{
		
		String word= "ALPHABET";
		int vowels=0, contant=0;
		word=word.toLowerCase();
		
		for(int i=0; i<word.length(); i++)
		{
			char ch=word.charAt(i);
			if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
			{
				vowels++;
			}
			else
			{
				contant++;
			}
		}
		System.out.println("No of Vowels in word " + word + " is " + vowels);
		System.out.println("No of contant in word " + word + " is " + contant);
	}
}