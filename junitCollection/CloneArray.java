package action;
import java.util.ArrayList;
import java.util.Collections;
public class CloneArray {
	public static ArrayList<String> cloneArray(ArrayList<String> c1){
		ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
        System.out.println("Cloned array list: " + newc1); 
        return c1;
		
	}
		                
		}
		

	
