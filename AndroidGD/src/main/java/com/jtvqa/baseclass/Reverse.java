package com.jtvqa.baseclass;

import org.testng.annotations.Test;

public class Reverse{
	
	
@Test	
public void array() {
	 int arrays[]={1,2,3,4,5};
	
	 int sum=0;
	
	for(int num:arrays) {
		
	sum=sum+num;
		
		System.out.println("sum of the array is:"+sum);
	}

	
	}

}
