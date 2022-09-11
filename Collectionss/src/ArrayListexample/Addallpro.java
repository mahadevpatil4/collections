package ArrayListexample;

import java.util.ArrayList;

public class Addallpro {
	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(190);
		arrayList.add(70);
		arrayList.add(50);
		
		ArrayList<Object> arrayList2 = new ArrayList<>();
		arrayList2.add(34);
		arrayList2.add(56);
		//arrayList2.addAll(arrayList);
		//System.out.println(arrayList2);
		
		arrayList.addAll(2, arrayList2);
		System.out.println(arrayList);

	}
}
