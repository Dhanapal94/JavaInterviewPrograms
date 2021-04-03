
public class PalindromeString {

	public static void main(String[] args) {
		String original ="MADAMN";
		String reverse="";
		int size = original.length();
		for(int i=size-1;i>=0;i--)
		{
			reverse = reverse+original.charAt(i);
		}
		System.out.println("Reverse string is "+reverse);
		
		if(original.equalsIgnoreCase(reverse))
		{
			System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
	}

}
