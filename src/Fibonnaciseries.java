
public class Fibonnaciseries {

	public static void main(String[] args) {
		int n =10;
		int a=0;
		int b =1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;		
		}
		System.out.println("Fibonnaic series value is :"+c);

	}

}
