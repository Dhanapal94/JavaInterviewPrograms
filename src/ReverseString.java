
public class ReverseString {

	public static void main(String[] args) {
		
		//Step 1
		String original ="Dhanapal";
		String reverse="";
		int size = original.length();
		for(int i=size-1;i>=0;i--)
		{
			reverse = reverse+original.charAt(i);
		}
		System.out.println("Reverse string is"+reverse);
		
		//Step 2;
		
		String org ="Karthik";
		char[] ch = org.toCharArray();
		String ne="";
		for(int j=org.length()-1;j>=0;j--)
		{
			ne+=ch[j];
		}
		System.out.println("Reverse new string is:"+ne);
		
		//Step 3
		
		String finala = "Pavithra";
		StringBuilder sb = new StringBuilder(finala);
		System.out.println("String Builder reverse is "+sb.reverse());
		
	}
	

}
