package com.basics;

public class Point2D {

	int x_cord,y_cord;
	public Point2D(int x,int y)
	{
		x_cord=x;
		y_cord=y;
		System.out.println("x and y are " +x_cord+ " "+y_cord);
		
	}
	
	public String getDetails(int x,int y)
	{
		return "point(" +x+ ", "+y+")";
		
	}
	
	public boolean isEqual(int x,int y)
	{
	
	if (x==y)
			return true;
		else
			return false;
		
	}
	
	
	public Point2D createPoint(int x, int y) {
		Point2D p = new Point2D(x, y);
		return p;
	}
	
		
}