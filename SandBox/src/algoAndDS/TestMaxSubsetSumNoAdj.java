package algoAndDS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaxSubsetSumNoAdj {

	  @Test
	  public void TestCase6() {
	    int[] input = {7, 10, 12, 7, 9, 14};
	    assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 33);
	  }

}
