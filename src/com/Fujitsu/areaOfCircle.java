package com.Fujitsu;

public class areaOfCircle 
{
    int r;
    double area;
	public areaOfCircle(int r)
	{
		super();
		this.r = r;
	}

   public void area() {
	   area=3.14*r*r;
	  
   }

@Override
public String toString() {
	return "areaOfCircle [area=" + area + "]";
}


    
    
    
}
