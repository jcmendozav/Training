package algoAndDS;

public class ValidateBTS {
	static class BST {
	    public int value;
	    public BST left;
	    public BST right;

	    public BST(int value) {
	      this.value = value;
	    }
	  }
	
	
	public static boolean validateBst(BST node) {
		return validateBst(node,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public static boolean validateBst(BST node, int initRange, int endRange){
		System.out.printf("node: %s, node.value: %s, init: %s, end: %s\n",node,(node!=null)?node.value:"NULL",initRange,endRange);
//		if(node==null) {
//			return true;
//		}
		if(node.value>=endRange || node.value<initRange) {
			return false;
		}
		else
		{
			if(node.left!=null &&  !validateBst(node.left,initRange,node.value))
//				if(node.value<=node.left.value) {
					return false;
//				}
			if(node.right!=null && !validateBst(node.right,node.value,endRange)) {
//				if(node.value>node.right.value) {
					return false;
//				}
			}
			
			//return validateBst(node.left,initRange,node.value)&&validateBst(node.right,node.value,endRange);
		}
		
		return true;
	}

}
