package algoAndDS;

import java.util.ArrayList;
import java.util.List;

public class UnderScoreString {

	
	
	public String perform(String str, String substring) {
		
		StringBuffer result= new StringBuffer();
		
		int lastIndex = -1;
		int currentIndex = 0;
		int lastOverLap=-1;
		int initOverLap=-1;
		int overLap=0;
		
		
		System.out.println("str: "+str.length()+", substring:"+substring.length());
		while(currentIndex>=0 && currentIndex<=(str.length()-substring.length())) {
			
			currentIndex = str.indexOf(substring, currentIndex);
			
			if((currentIndex-lastIndex)>substring.length()) {
				initOverLap=lastIndex-overLap;
				lastOverLap=lastIndex+substring.length();
				overLap=0;
			} else if(lastIndex>=0){
				overLap++;
			}
			
			System.out.println("currentIndex: "+currentIndex+
					", lastIndex:"+lastIndex+
					", overLap:"+overLap+
					", initOverLap:"+initOverLap+
					", lastOverLap:"+lastOverLap
					);

			lastIndex=currentIndex;
			currentIndex++;
		}
		
		
		
		return result.toString();
	}
	
	class interval {
		int begin;
		int end;
		public interval(int begin, int end) {
			// TODO Auto-generated constructor stub
			this.begin=begin;
			this.end=end;
		}
		

		
		public int getBegin() {
			return begin;
		}
		public int getEnd() {
			return end;
		}
	}
	
	public String perform2(String str, String substring) {
		
		StringBuffer result= new StringBuffer();
		
		int lastIndex = -1;
		int currentIndex = 0;
		int foundIndex =-1;
		int lastOverLap=-1;
		int initOverLap=-1;
		int overLap=0;
		List<interval> intervalList = new ArrayList<UnderScoreString.interval>();
		
		
		System.out.println("str: "+str.length()+", substring:"+substring.length());
		while(currentIndex<=(str.length()-substring.length()+1)) {
			
			foundIndex = str.indexOf(substring, currentIndex);
			
			if(foundIndex>=0 ) { 
				
				if(initOverLap<0) initOverLap=foundIndex;
				else 
					if(foundIndex>lastOverLap+1 ) {
					//updateResult(result,str,initOverLap, lastOverLap);
					System.out.println("Saving: "+currentIndex+

							", initOverLap:"+initOverLap+
							", lastOverLap:"+lastOverLap
							);
					
					intervalList.add(new interval(initOverLap, lastOverLap));
					initOverLap=foundIndex;	
					
					
				}
				lastOverLap=foundIndex+substring.length()-1;
				currentIndex=foundIndex;


			} 
			else {
				intervalList.add(new interval(initOverLap, lastOverLap));
//				System.out.println("Saving: "+currentIndex+
//
//						", initOverLap:"+initOverLap+
//						", lastOverLap:"+lastOverLap
//						);
				break;
			}
//			
//
//			
//			System.out.println("currentIndex: "+currentIndex+
//					", lastIndex:"+lastIndex+
//					", foundIndex:"+foundIndex+
//					", overLap:"+overLap+
//					", initOverLap:"+initOverLap+
//					", lastOverLap:"+lastOverLap
//					);

			lastIndex=currentIndex;
			currentIndex++;
		}
		
		int last=-1;
		for (interval interval : intervalList) {
			if(interval.getBegin()>=0)
			{
				updateResult(result, str, interval.getBegin(), interval.getEnd(),last);
				last=interval.getEnd();
			}
		}
		if(last<str.length()-1) {
			result.append(str.substring(last+1));
		}
		System.out.println("result:::"+result.toString());
		return result.toString();
	}

	private void updateResult(StringBuffer result, String str, int initOverLap, int lastOverLap, int last) {
		// TODO Auto-generated method stub
		if(initOverLap>=0) {
			if(initOverLap>0)
				result.append(str.substring(last+1,initOverLap));
		result.append("_"+str.substring(initOverLap, lastOverLap+1)+"_");

		}
	}
}
