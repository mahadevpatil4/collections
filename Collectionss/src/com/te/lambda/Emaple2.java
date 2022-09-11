package com.te.lambda;

public class Emaple2 {
public static void main(String[] args) {
	Sub s=(int a,int b)->{
		int res=a-b;
		return res;
	};
System.out.println(s.sub(10, 5));	
	
}
}
