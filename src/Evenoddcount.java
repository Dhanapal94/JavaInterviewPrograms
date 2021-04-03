
public class Evenoddcount {

	public static void main(String[] args) {
	     int num = 23456547;
	     int evencount =0;
	     int oddcount =0;
	     while(num!=0)
	     {
	    	 int val = num%10;
	    	 if(val%2==0)
	    	 {
	    		 evencount++;
	    	 }
	    	 else
	    	 {
	    		 oddcount++;
	    	 }
	    	 num=num/10;
	     }
	     System.out.println("Even number count is : "+evencount);
	     System.out.println("Odd number count is : "+oddcount);
	     

	}

}
