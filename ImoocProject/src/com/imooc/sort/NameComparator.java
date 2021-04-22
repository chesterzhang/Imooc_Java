package com.imooc.sort;

import java.util.Comparator;

//°´Ãû×ÖÉıĞòÅÅĞò
public class NameComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		// °´Ãû×ÖÉıĞòÅÅĞò
		String name1=o1.getName();
		String name2=o2.getName();
		
		int n=name1.compareTo(name2);
		
		return n;
	}
	

}
