package com.app;

import java.util.HashMap;

public class LongestString {

	static int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str = "iiiaaabbbinvoicezzzzz";
		
		//longestString(longestString(str));
		
		
	}
	
	public static String longestString(String str) {
		String result="";
HashMap<Character,Integer> visitedChar = new HashMap<Character, Integer >();
		
		int counter=0;
		int last_counter=1;
		int lastIndex=0;
		int maxSize=1;
		int maxSizeIndex=0;
		int index=0;
		
		if(str.length()==1) {return str;}
		for(index = 0; index<str.length();index++) {
			char ch = str.charAt(index);
			if(visitedChar.containsKey(ch)) {
				lastIndex=visitedChar.get(ch);
				System.out.println("currentIndex: "+index+", lastIndex:"+lastIndex+", ch:"+ch+", visited:"+visitedChar.entrySet());
				if(counter>maxSize) {
					maxSize=index-lastIndex-1;
					maxSizeIndex=index;
				}
				//counter= counter-1;
				visitedChar.clear();
				//index=lastIndex;
				counter=0;
				for(int i=lastIndex+1;i<=index;i++) {
					ch = str.charAt(i);
					visitedChar.put(ch,i);
					counter++;
				}
				
			}else {
				visitedChar.put(ch,index);
				counter++;
			}
			last_counter=counter;
			
			
		}
		if(counter>maxSize) {
			maxSize=counter;
			maxSizeIndex=index;
		}
		System.out.println("maxSizeIndex: "+maxSizeIndex+", maxSize:"+maxSize);
		result = str.substring(maxSizeIndex-maxSize,maxSizeIndex);
		return result;
	}

}
