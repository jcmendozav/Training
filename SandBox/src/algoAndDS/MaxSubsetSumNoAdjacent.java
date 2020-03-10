package algoAndDS;

public class MaxSubsetSumNoAdjacent {
	
	static public int maxSubsetSumNoAdjacent(int [] array) {
		
		
		int result =0 ;
		if(array.length==0) return result;
		if(array.length==1) {
			return array[0];
		}
		
		if(array.length==2) {
			return Math.max(array[0],array[1]);
		}
		int [] maxList = new int [array.length];
		
		maxList[0] = array[0];
		maxList[1] = Math.max(array[0],array[1]);
		
		for (int i = 2; i < array.length; i++) {
			
			int currentVal=array[i];
			maxList[i] = Math.max(maxList[i-2] + currentVal, maxList[i-1]);
			result=Math.max(result,maxList[i]);
		}
		
		
		return result;
	}

}
