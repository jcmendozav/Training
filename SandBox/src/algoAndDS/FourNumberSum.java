package algoAndDS;

import java.util.ArrayList;
import java.util.Arrays;import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FourNumberSum {
	
	public static List<Integer []> fourNumberSum(int [] array, int targetSum){
		
		System.out.printf(""
				+ "targetSum:%s, "
				+ "Array: %s\n", 
				targetSum,
				Arrays.toString(array)
				);
//		Arrays.sort(array);
		HashSet<Integer []> result = new HashSet<Integer[]>();
		HashSet<Integer> visitedIndexes = new HashSet<Integer>();
		HashMap< Integer,Integer []> pairSumMap = new HashMap< Integer, Integer []>();
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i+1;  j!=i && j < array.length; j++) {
				int currentSum = array[i]+array[j];
				Integer [] pair = new Integer [] {i,j};
				Arrays.sort(pair);
				
				
				int difference = targetSum -currentSum;
				if(pairSumMap.containsKey(difference)) {
					Integer [] pairFound =  pairSumMap.get(difference);
					Arrays.sort(pairFound);
					Integer [] newResult = new Integer []{
							array[pairFound[0]],
							array[pairFound[1]],
							array[i],
							array[j]};					
					
					System.out.printf(""
							+ "target:%s, "
							+ "currentSum:%s, "
							+ "diff:%s, "
							+ "i:%s, "
							+ "j:%s, "
							+ "Pair found: %s, " 
							+ "newResult: %s"
							+ "\n", 
							targetSum,
							currentSum,
							difference,
							i,
							j,
							Arrays.toString(pairFound),
							Arrays.toString(newResult)
							);

					Integer [] currentIndexes = new Integer []{
							pairFound[0],
							pairFound[1],
							i,
							j};
					Arrays.sort(newResult);

						if(
								
								i!=pairFound[1]
								&&	
								j!=pairFound[0]
								&&
								j!=pairFound[1]
								&&
								i!=pairFound[0]
								&&
								!containsQuad(result,newResult))
							result.add( newResult);
							visitedIndexes.addAll(Arrays.asList(currentIndexes));
							
//					}
				}
//				else
					pairSumMap.put( currentSum, pair );
				
				
				System.out.printf("i:%s,j:%s,currentSum:%s\n",i,j,currentSum);
			}
			
		}
		System.out.printf("pairSumMap:%s \n",pairSumMap);

		result.forEach(
				(e)->{
					System.out.printf("result:%s \n",Arrays.toString(e));
			
		}
				);
		
		return new ArrayList<Integer[]>(result);
		
	}

	private static boolean containsQuad(HashSet<Integer[]> result, Integer[] newResult) {
		// TODO Auto-generated method stub
		System.out.printf("result: %s, newResult: %s\n", 
				result,
				Arrays.toString(newResult));
		for (Iterator iterator = result.iterator(); iterator.hasNext();) {
			Integer[] integers = (Integer[]) iterator.next();
			if(Arrays.equals(integers,newResult)) {
				return true;
			}
			
		}
		return false;
	}

}
