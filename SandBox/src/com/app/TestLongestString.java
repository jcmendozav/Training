package com.app;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestLongestString {

	@Test
	@DisplayName("in the middle")
	void test() {
		//fail("Not yet implemented");
		
		String str = "aaxcmbbbb";
		assertEquals("axcmb",LongestString.longestString(str));
	}
	
	@Test
	@DisplayName("two in the middle")
	void test2() {
		//fail("Not yet implemented");
		
		String str = "aaaaxcmbbbbqwerty";
		assertEquals("bqwerty",LongestString.longestString(str));
	}

	
	@Test
	@DisplayName("at the end")
	void test3() {
		//fail("Not yet implemented");
		
		String str = "asdfghjklaaaaxcmbbbbqwerty";
		assertEquals("asdfghjkl",LongestString.longestString(str));
	}

	
	@Test
	@DisplayName("at the beginning")
	void test4() {
		//fail("Not yet implemented");
		
		String str = "asdfghjklaaaaxcmbbbbqwerty";
		assertEquals("asdfghjkl",LongestString.longestString(str));
	}
	
	@Test
	@DisplayName("only three character")
	void test5() {
		//fail("Not yet implemented");
		
		String str = "asd";
		assertEquals("asd",LongestString.longestString(str));
	}
	
	@Test
	@DisplayName("Algo expert test 4")
	void test6() {
		//fail("Not yet implemented");
		
		String str = "abcdeabcdefc";
		assertEquals("abcdef",LongestString.longestString(str));
	}

}
