package sumOfDigit;

import java.util.Arrays;

public class ArmstrongNumber {
	public static boolean armNum(long n) {
		boolean flag =true;
		long calculated=0;long reminder;  
		long original=n;  
		while(n>0){  
			reminder=n%10;  
			n=n/10;  
			calculated=calculated+(reminder*reminder*reminder);  
		} 
		
		if(original!=calculated)  {
			
			flag=false;
		}
		else {
			flag=true;
		}
		return flag;   
}

}


