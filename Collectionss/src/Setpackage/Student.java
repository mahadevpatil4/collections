package Setpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Student {
public static void main(String[] args) {
	TreeSet<Integer> treeSet = new TreeSet<>();
	treeSet.add(10);
	treeSet.add(40);
	treeSet.add(30);
	treeSet.add(80);
	System.out.println(treeSet);
	
	ArrayList<Integer> arrayList = new ArrayList<>(treeSet);
	
	Collections.sort(arrayList,Collections.reverseOrder());
	System.out.println(arrayList);
}
	
	
	
}
