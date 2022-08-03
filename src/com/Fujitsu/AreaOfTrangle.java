package com.Fujitsu;

import java.util.Scanner;

public class AreaOfTrangle {
	
	
		
		float b, h ,area ;

		public AreaOfTrangle(float b, float h) {
			super();
			this.b = b;
			this.h = h;
		}
		
	//	Scanner sc = new Scanner(System.in);
		
	//	System.out.println("Enter base");
	//	b= sc.nextInt();
	//	System.out.println("Enter height");
	//	h= sc.nextInt();
		
		public void areaTrangle() {
		
		area =  (b*h) /2;
		}
		

		@Override
		public String toString() {
			this.areaTrangle();
			return "AreaOfTrangle [area=" + area + "]";
		}
		

}
