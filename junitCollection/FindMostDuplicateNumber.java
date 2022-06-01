package junitCollection;
	import java.util.HashMap;
	import java.util.Map;
	public class FindMostDuplicateNumber {
		public static String mostDuplicate(String input) {
          
	        Map<Character, Integer> map = new HashMap<>();  
	        int maxValue = 0;
	        char[] charArray = input.toCharArray();
	        String output = "";
	        for (int i = 0; i < charArray.length; i++) {
	            map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
	            if(maxValue< map.get(charArray[i])){
	                maxValue = map.get(charArray[i]);
	            }
	        }

	        for (Map.Entry<Character,Integer> entry : map.entrySet()){
	            if(entry.getValue() == maxValue){
	                output+=entry.getKey();
	            }
	        }
	        return output;
	    }
	}