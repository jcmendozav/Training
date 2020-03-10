package algoAndDS;

public class KadanesProgram {
	
	public static int kadanesAlgorithm(int [] array) {
		System.out.println("########### kadanesAlgorithm begin ###########: "+Integer.MIN_VALUE);
		int i=1; 
		
		int currentMax = array[0];
		int response = array[0];

		while(i<array.length ) {
			int currentVal = array[i];		
			currentMax = Math.max(currentMax+currentVal, currentVal);
			response = Math.max(response, currentMax);
			System.out.printf("i:%s,arr[i]:%d,currentMax:%d,response:%d\n",i,currentVal,currentMax,response);

			i++;
		}

		return response;
	}

}
