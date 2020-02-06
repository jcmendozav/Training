package algoAndDS;

import java.util.List;

public class SameBST {

	public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
		// Write your code here.
		System.out.println("arrayOne: "+arrayOne);
		System.out.println("arrayTwo: "+arrayTwo);
		if (arrayOne.size() != arrayTwo.size()) {
			return false;
		}
		if (arrayOne.get(0) != arrayTwo.get(0)) {

			return false;
		}
		//return sameBstsHelper(arrayOne, 0, arrayTwo, 0, 0);
		 return true;
	}

//	private static boolean sameBstsHelper(List<Integer> arrayOne, int indexOne, List<Integer> arrayTwo, int indexTwo,
//			int level) {
//		// TODO Auto-generated method stub
//		level++;
//		System.out.printf("level:%s, indexOne:%s, indexTwo:%s\n", level, indexOne, indexTwo);
//
//		int nextLeftOne = getNextLeft(arrayOne, indexOne);
//		int nextLeftTwo = getNextLeft(arrayTwo, indexTwo);
//		int nextRightOne = getNextRight(arrayOne, indexOne);
//		int nextRightTwo = getNextRight(arrayTwo, indexTwo);
//
//		System.out.printf("level:%s, "+
//				"nextLeftOne:%s, 	nextLeftTwo:%s, 	nextRightOne:%s, 	nextRightTwo:%s\n", level,
//				 nextLeftOne, 		nextLeftTwo, 		nextRightOne, 		nextRightTwo);
//
//		if (nextLeftOne < 0 && nextRightOne < 0 && nextLeftTwo < 0 && nextRightTwo < 0) {
//			return true;
//		}
//		boolean leftFlag = true;
//		boolean rightFlag = true;
//		if (nextLeftOne >= 0 && nextLeftTwo >= 0)
//			leftFlag = arrayOne.get(nextLeftOne).equals(arrayTwo.get(nextLeftTwo));
//		if (nextRightOne >= 0 && nextRightTwo >= 0)
//			leftFlag = arrayOne.get(nextRightOne).equals(arrayTwo.get(nextRightTwo));
//
//		if (leftFlag && rightFlag) {
//			return sameBstsHelper(arrayOne, nextLeftOne, arrayTwo, nextLeftTwo, level)
//					&& sameBstsHelper(arrayOne, nextRightOne, arrayTwo, nextRightTwo, level);
//		} else
//			return false;
//
////	return true;
//	}

	private static int getNextRight(List<Integer> array, int beginIdex, int limit) {
		// TODO Auto-generated method stub
		System.out.printf("tag: %s, beginIdex:%s, array:%s, limit:%s\n", "getNextRigh", beginIdex, array,limit);
		if (beginIdex < array.size() && beginIdex >= 0)
			for (int i = beginIdex + 1; i < array.size(); i++) {
				if (array.get(i) >= array.get(beginIdex) && array.get(i)>=limit) {
					return i;
				}
			}
		return -1;
	}

	private static int getNextLeft(List<Integer> array, int beginIdex, int limit) {
		// TODO Auto-generated method stub
		System.out.printf("tag: %s, beginIdex:%s, array:%s, limit:%s\n", "getNextLeft", beginIdex, array,limit);
		if (beginIdex < array.size() && beginIdex >= 0)
			for (int i = beginIdex + 1; i < array.size(); i++) {
				if (array.get(i) < array.get(beginIdex) && array.get(i)<limit) {
					return i;
				}
			}
		return -1;
	}
	
	public static void printBST(String tag,List<Integer> array, int index, int lvl) {
		if(index<array.size()) {
			System.out.printf("tag: %s, lvl: %s, index: %s, element: %s\n", tag, lvl, index, array.get(index));
			lvl++;
			int leftIndex=  getNextLeft(array, index, array.get(index));
			int rightIndex=  getNextRight(array, index, array.get(index));
			if(leftIndex<0&&rightIndex<0)
				return;
			
			if(leftIndex>=0)
				printBST("left",array,leftIndex,lvl);
			
			if(rightIndex>=0)
				printBST("right",array,rightIndex,lvl);
		}
		return;
	}

}
