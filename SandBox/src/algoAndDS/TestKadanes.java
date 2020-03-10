package algoAndDS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestKadanes {

	@Test
//	@Disabled
	void test() {
		int[] input = {1, 2, 3, 4, 5, 6, -20, 7, 8, 9, 10};
	    assertTrue(KadanesProgram.kadanesAlgorithm(input) == 35);	
	    }

	
	  @Test
//		@Disabled
	  public void TestCase3() {
	    int[] input = {-10, -2, -9, -4, -8, -6, -7, -1, -3, -5};
	    assertTrue(KadanesProgram.kadanesAlgorithm(input) == -1);
	  }
	  
	@Test
//	@Disabled
	void test8() {
		
	    int[] input = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
	    assertTrue(KadanesProgram.kadanesAlgorithm(input) == 19);
	}
	
	 @Test
//		@Disabled
	  public void TestCase9() {
	    int[] input = {8, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
	    assertTrue(KadanesProgram.kadanesAlgorithm(input) == 23);
	  }
	 
	  @Test
//		@Disabled
	  public void TestCase13() {
	    int[] input = {100, 8, 5, -9, 1, 3, -2, 3, 4, 7, 2, -18, 6, 3, 1, -5, 6, 20, -23, 15, 1, -3, 4};
	    assertTrue(KadanesProgram.kadanesAlgorithm(input) == 135);
	  }
}
