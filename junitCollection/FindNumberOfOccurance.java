package junitCollection;
import java.util.Map;
import java.util.TreeMap;
public class FindNumberOfOccurance {
	public static void main(String[] args) {
		
		Map<Integer, Integer> map=numberOfOccurance(new int[] {1,2,3,4,6,4,3,2});
		System.out.println(map);
	}
	
	public static Map<Integer,Integer> numberOfOccurance(int[] data) {
	
	Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
	
	for (int i = 0; i < data.length; i++) {
		map.put(data[i], map.getOrDefault(data[i], 0)+1);
	}
	return map;
	}
}

	

