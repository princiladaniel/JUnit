package reverseString;
public class ReverseString {
	
	public static String reversestr(String data) {
		String output="";
		if(data==null || data=="") {
			throw new NullPointerException("null and empty input");
		}
		char[] chr = data.toCharArray();
		for (int i = chr.length-1; i>=0; i--) {
		output=output+chr[i];	
		
		
	}
		
		return output;
		
	}
}
