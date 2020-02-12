package algoAndDS;

import java.util.Arrays;

public class SmallestDifference {
	
	
	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Write your code here.
		int[] result=null;
		Arrays.sort(arrayOne);		
		Arrays.sort(arrayTwo);
		int smallDiff=Integer.MAX_VALUE;
		int i = 0; int j = 0;
		while(i<(arrayOne.length) && j < arrayTwo.length) {
			
			int currentDiff = Math.abs(arrayOne[i]-arrayTwo[j]);
			if(currentDiff==0)
			{
				result= new int[] {arrayOne[i],arrayTwo[j]};
				break;
			}else {
				
				if(currentDiff<smallDiff) {
					smallDiff=currentDiff; 
				}
			}
		}

    return result;
  }

}
