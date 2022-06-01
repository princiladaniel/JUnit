package junitCollection;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicate {
	
	public static Set<Character> removedup (String input) {
			Set<Character> unique = new LinkedHashSet<Character>();
			char[] charArray = input.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				if(!unique.add(charArray[i])) {
					unique.remove(charArray[i]);	
				}
			}
			System.out.println(unique);
			return unique;
			
	}
		
	}

