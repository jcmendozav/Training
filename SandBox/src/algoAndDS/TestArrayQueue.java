package algoAndDS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayDeque;
class TestArrayQueue {

	@Test
	void test() {

		ArrayDeque<String> stack = new ArrayDeque<String>();
		stack.addLast("{");
		stack.addLast("[");
		
		assertEquals("[", stack.getLast());
	}

}
