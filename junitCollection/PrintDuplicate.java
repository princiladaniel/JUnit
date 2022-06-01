package junitCollection;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicate {

    public static void main(String[] args) {
        
        int[] output = duplicate(null);
        System.out.println("Actual Output"+Arrays.toString(output));
        }
    public static int[] duplicate(int[] num  ) {
    	
    	if(num == null) {
    		
    		throw new IllegalArgumentException("Invalid input");
    	}
        Set<Integer> val=new TreeSet<>();
        Set<Integer> tempList = new TreeSet<>();
        for (Integer integer : num) {
            if(!val.add(integer)) {
                tempList.add(integer);
            }
        }
        
        int output[]=new int[tempList.size()];
        int i=0;
        for(int input:tempList) {
            output[i++]=input;
        }
        return  output;
    }




}
