package com.Fujitsu;

public class CubeArea 
{
		  int C,m;

		public CubeArea(int m) {
			super();
			this.m = m;
			// TODO Auto-generated constructor stub
		}
		
	public void cube()
	{
		C=m*m*m;
	}

	@Override
	public String toString() {
		return "CubeArea [C=" + C + "]";
	}
	
	
}
