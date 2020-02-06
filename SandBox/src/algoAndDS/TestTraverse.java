package algoAndDS;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestTraverse {

	@Test
	void test(){
		BST tree = new BST.BSTBuilder().
				setValue(10).
					setLeft(new BST.BSTBuilder().
							setValue(5).
								setLeft(new BST.BSTBuilder().
										setValue(2).
											setLeft(new BST.BSTBuilder().
													setValue(1).build()
													).
										build()
										).
								setRight(new BST.BSTBuilder().
										setValue(5).build()).
								build()			).	
					setRight(new BST.BSTBuilder().
							setValue(15).
							setRight(new BST.BSTBuilder().
									setValue(22).build()).
							build()
							
							).
					build();
//		List<Integer> array = new ArrayList();
//		TraverseBST.inOrderTraverse(tree,  new ArrayList());
		System.out.println(TraverseBST.inOrderTraverse(tree,  new ArrayList()));
		System.out.println(TraverseBST.preOrderTraverse(tree,  new ArrayList()));
		System.out.println(TraverseBST.postOrderTraverse(tree,  new ArrayList()));
	}
}
