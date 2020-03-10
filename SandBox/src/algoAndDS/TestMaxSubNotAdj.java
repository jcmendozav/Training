package algoAndDS;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMaxSubNotAdj {
	
	  @Test
	  public void TestCase6() {
	    int[] input = {7, 10, 12, 7, 9, 14};
	    assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 33);
	  }
	  
	  @Test
	  public void TestCase11() {
	    int[] input = {30, 25, 50, 55, 100};
	    assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 180);
	  }

	  @Test
	  public void TestCase12() {
	    int[] input = {30, 25, 50, 55, 100, 120};
	    assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 205);
	  }

	  @Test
	  public void TestCase13() {
	    int[] input = {7, 10, 12, 7, 9, 14, 15, 16, 25, 20, 4};
	    assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 72);
	  }

}
