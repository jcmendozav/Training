package algoAndDS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

class TestUnderScore {

	@org.junit.jupiter.api.Test
	void test() {

		UnderScoreString underScoreString = new UnderScoreString();
		String str = "this is a test to see if it works";
		String substring = "test";
		String expected="this is a _test_ to see if it works";
		assertEquals(expected, underScoreString.perform2(str, substring));
	
	}

	@org.junit.jupiter.api.Test
	void test2() {

		UnderScoreString underScoreString = new UnderScoreString();
		String str = "aaaa aa";
		String substring = "aa";
		String expected="_aaaa_ _aa_";
		assertEquals(expected, underScoreString.perform2(str, substring));
	
	}
	
	@org.junit.jupiter.api.Test
	void test3() {

		UnderScoreString underScoreString = new UnderScoreString();
		String str = "abcabcabcabcabcabcabcabcabcabcabcabcabcabc";
		String substring = "abc";
		String expected="_abcabcabcabcabcabcabcabcabcabcabcabcabcabc_";
		assertEquals(expected, underScoreString.perform2(str, substring));
	
	}
	
	@org.junit.jupiter.api.Test
	void test4() {

		UnderScoreString underScoreString = new UnderScoreString();
		String str = "abababababababababababababaababaaabbababaa";
		String substring = "a";
		String expected="_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_aa_b_a_b_aaa_bb_a_b_a_b_aa_";
		assertEquals(expected, underScoreString.perform2(str, substring));
	
	}
}
