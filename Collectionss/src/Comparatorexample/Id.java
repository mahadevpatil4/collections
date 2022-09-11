package Comparatorexample;

import java.util.Comparator;

public class Id implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {

		return o1.id-o2.id;
	}

}


//+ insertion oreder will be the op
//- and o1,o2 we have to change for asc.. and desc..