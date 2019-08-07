package com.code.Mymavenpjt;

public class appium {

		
		int a=5;
		
		void idea() {
			System.out.println(a);
		}

		public static class kid extends appium {
			int b=20;
	     
	void idea(int c) {
	        
		c=a+b;
		System.out.println(c);
	        
		}
		public static void main(String[] args) {
            appium s=new appium();
			s.idea();
		
		}
	}
}
	
	