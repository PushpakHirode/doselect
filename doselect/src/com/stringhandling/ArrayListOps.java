package com.stringhandling;

import java.util.*;
public class ArrayListOps {

	public ArrayList<Integer> makeArrayListInt(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			list.add(0);
		}
		return list;
 		
	}
	
	public ArrayList<Integer> reverseList(ArrayList<Integer> list){
		Collections.reverse(list);
		return list;
	}
	
	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
		ArrayList<Integer> list1 = new ArrayList<>();
			
		for(Integer i : list) {
			if(i==m)
				list1.add(n);
			else
				list1.add(i);
		}
		return list1;
	}
}

