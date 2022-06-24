package action;
import java.util.*;
public class RotateTheNumberUsingList {
	public static List<String> number(List<String> list, int num) {
	      Collections.rotate(list, num);;
	      System.out.println("rotate: " + list);
		return list;
	   } 
}
	
