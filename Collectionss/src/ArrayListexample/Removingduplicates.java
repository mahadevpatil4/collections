package ArrayListexample;

import java.util.ArrayList;
import java.util.Collections;

public class Removingduplicates {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(140);
		arrayList.add(30);
		
		
		
		for(int i=0;i<arrayList.size();i++) {
			
			for (int j = 1+i; j < arrayList.size(); j++) {
			if(arrayList.get(i)==arrayList.get(j)) {
				arrayList.remove(j);
				
			}
				
			}
			
		}
		
		System.out.println(arrayList);	
		
//		
//	int frequency = Collections.frequency(arrayList, 10);
//	System.out.println(frequency);
		
		
		
//		int y = 0;
//		for (int i = 0; i < arrayList.size(); i++) {
//			y++;
//		}
//		System.out.println(y);
//
//		System.out.println("==================================");
//		
//		int c = 0;
//		for (int i = 0; i < arrayList.size(); i++) {
//			for (int j = 1 + i; j < arrayList.size(); j++) {
//				if (arrayList.get(i) == arrayList.get(j)) {
//
//					c++;
//
//				}
//
//			}
//			System.out.println(c);
//		}

	}
}