
public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 4114;
		int numb =num;
		int rev=0;
		while(numb!=0)
		{
		    rev = rev*10+numb%10;
			numb = numb/10;
		}
		System.out.println(rev);
		if(num==rev)
		{
			System.out.println("Number is a palindrome number");
		} 
		else
		{
			System.out.println("Number is not a palindrome");
		}

	}

}
