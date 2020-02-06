package algoAndDS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInvertBTS {

	@Test
	void test() {

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
		
		InvertBTS.print(tree, "head-before",0);
		InvertBTS.invert(tree);
		InvertBTS.print(tree, "head-after",0);
	}

}
