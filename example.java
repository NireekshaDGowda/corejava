package com.basics;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Point2D p=new Point2D(10,20);
Point2D p1=new Point2D(5,-2);
Point2D p2=new Point2D(1,1);
System.out.println(p.equals(p1));
System.out.println(p2.equals(p2));


//p.isEqual(10,11);
p.getDetails(10,20);
p1.getDetails(5,-2);

Point2D p3 = p1.createPoint(5,-20);
	}
}
