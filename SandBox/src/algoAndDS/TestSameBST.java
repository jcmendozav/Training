package algoAndDS;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestSameBST {

	  @Test
	  public void TestCase3() {
	    List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2));
	    List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(10, 8, 5, 15, 2, 12, 94, 81));
	    SameBST.printBST("head",arrayOne, 0, 0);
	    assertTrue(SameBST.sameBsts(arrayOne, arrayTwo) == true);
	  }

	  
	  @Test
	  @Disabled
	  public void TestCase11() {
	    List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, 10));
	    List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(10, 8, 5, 15, 2, 10, 12, 94, 81));
	    assertTrue(SameBST.sameBsts(arrayOne, arrayTwo) == false);
	  }
}
