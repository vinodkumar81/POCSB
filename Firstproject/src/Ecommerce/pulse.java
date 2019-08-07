package Ecommerce;

import org.testng.annotations.Test;


public class pulse {
	
	private static int age;
	private static String frequency;

	public void age(){
		
		age=23;
		frequency="week";
	}
	
public static void main(String[] args) {
		pulse s=new pulse();
		s.age();
	
		System.out.println("age=" +age) ;
		System.out.println("frequency=" +frequency);

	}

}
