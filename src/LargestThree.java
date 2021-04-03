
public class LargestThree {

	public static void main(String[] args) {
		 int a = 20,b=10,c=25; 
		 if(a>b&&a>c)
		 {
			 System.out.println("A is largest number");
		 }
		 else if(b>c&&b>a)
		 {
			 System.out.println("B is largest Number");
		 }
		 else
		 {
			 System.out.println("C is largest Number");
		 }

		 int large = a>b?a:b;
		 int largest = c>large?c:large;
		 System.out.println(largest);
	}

}
