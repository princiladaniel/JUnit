package junitCollection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class ValidOccuranceCaseMap {
	@Test
	public void Occurance() {
		
		 int[] num= {1,2,3,2,3,11,11,12};
			Map<Integer, Integer> numberOfOccurance = FindNumberOfOccurance.numberOfOccurance(num);
			Map<Integer, Integer> expectedOutput=new TreeMap<>();
			expectedOutput.put(1, 1);
			expectedOutput.put(2, 2);
			expectedOutput.put(3, 2);
			expectedOutput.put(11,2);
			expectedOutput.put(12,1);
			System.out.println("Input:1,2,3,2,3,11,11,12 Expected:{1=1, 2=2, 3=2, 11=2, 12=1} Actual:"+numberOfOccurance);
			assertEquals(numberOfOccurance,expectedOutput);
	}
	@Test
	public void Occurance1() {
		
		 int[] num= {11,12,13,14,15};
			Map<Integer, Integer> numberOfOccurance = FindNumberOfOccurance.numberOfOccurance(num);
			Map<Integer, Integer> expectedOutput=new TreeMap<>();
			expectedOutput.put(11,1);
			expectedOutput.put(12,1);
			expectedOutput.put(13,1);
			expectedOutput.put(14,1);
			expectedOutput.put(15,1);
			System.out.println("Input:11,12,13,14,15 Expected:{11=1, 12=1, 13=1,14-1,15-1 } Actual:"+numberOfOccurance);
			assertEquals(numberOfOccurance,expectedOutput);
	}

	
}

