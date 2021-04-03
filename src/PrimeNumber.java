//Natural Number greater than 1
//Divisble by only two factors by 1 and the Number itself
public class PrimeNumber {

	public static void main(String[] args) {
		int n = 18;
		int count=0;
		if( n>1)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
				
			}
			System.out.println(count);
			if(count==2)
			{
				System.out.println("Its  a palindrome number");
				
			}
			
			else
			{
				System.out.println("Its not a palindrome number");
			}
			
		}
		else
		{
			System.out.println("Its not a palindrome number");
		}

	}

}
