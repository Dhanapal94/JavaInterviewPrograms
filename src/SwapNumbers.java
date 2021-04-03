
public class SwapNumbers {

	public static void main(String[] args) {
		
		//Step 1	
		int a =10;
		int b =20;
		/*int temp =a;
		a=b;
		b=temp;
		System.out.println("*****After Swapping****");
		System.out.println("Value of a is:"+a);
		System.out.println("Value of b is:"+b);*/
		
		//step2;
		int c =10;
		int d =20;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("*****After Swapping****");
		System.out.println("Value of c is:"+c);
		System.out.println("Value of d is:"+d);
		
		//Step3
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("*****After Swapping****");
		System.out.println("Value of a is:"+a);
		System.out.println("Value of b is:"+b);
		
				
		
		

	}

}
