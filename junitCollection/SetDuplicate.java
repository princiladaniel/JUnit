package junitCollection;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDuplicate {
	public static  Set<String> removeDups(String[] text ) {
		Set <String> str=new LinkedHashSet<String>();
		for (String output : text) {
			str.add(output);
			}
		System.out.println(str);
	        return str;
	}
}
	
