package algoAndDS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import desing.pattern.builder.Order;


class TestBSTClosest {

	@Test
	void test() {
		
		BST tree = new BST.BSTBuilder().
		setValue(0).
			setLeft(new BST.BSTBuilder().
					setValue(-1).build()).
			setRight(new BST.BSTBuilder().
					setValue(20).build()).
			build();
		
		assertEquals(20, BTSClosest.findClosestValueInBst(tree, 19));
			
	}
	
	@Test
	void test2() {
		
		BST tree = new BST.BSTBuilder().
		setValue(0).
			setLeft(new BST.BSTBuilder().
					setValue(-1).build()).
			setRight(new BST.BSTBuilder().
					setValue(20).
					setLeft(new BST.BSTBuilder().
							setValue(10).build()).
					setRight(new BST.BSTBuilder().
							setValue(30).build()).
					build()
					
					).
			build();
		
		assertEquals(30, BTSClosest.findClosestValueInBst(tree, 29));
			
	}

}
