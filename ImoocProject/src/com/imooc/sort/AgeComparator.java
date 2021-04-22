package com.imooc.sort;

import java.util.Comparator;

//°´ÄêÁä½µĞòÅÅĞò
public class AgeComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		
		int age1=o1.getMonth();
		int age2=o2.getMonth();
	 
		return age2-age1;
	}

	
}
