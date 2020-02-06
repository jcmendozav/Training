package algoAndDS;

import java.util.List;

public class TraverseBST {

	public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
	    // Write your code here.
		if(tree!=null) {
			if(tree.left!=null) {
				inOrderTraverse(tree.left,array);
			}
			array.add(tree.value);
			if(tree.right!=null) {
				inOrderTraverse(tree.right,array);
			}
			
		}
		
	    return array;
	  }

	  public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
	    // Write your code here.
			if(tree!=null) {
				array.add(tree.value);
				if(tree.left!=null) {
					preOrderTraverse(tree.left,array);
				}
				if(tree.right!=null) {
					preOrderTraverse(tree.right,array);
				}
				
			}
	    return array;
	  }

	  public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
	    // Write your code here.
			if(tree!=null) {
				if(tree.left!=null) {
					postOrderTraverse(tree.left,array);
				}
				if(tree.right!=null) {
					postOrderTraverse(tree.right,array);
				}
				array.add(tree.value);
				
			}
	    return array;
	    }
}
