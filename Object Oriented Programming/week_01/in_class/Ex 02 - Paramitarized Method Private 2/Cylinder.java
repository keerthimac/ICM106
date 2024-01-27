import java.util.*;

class Cylinder{
	//--------------------Attribute declaration-------------------------
	private double radius;
	private double length;
	//--------------------Method declaration----------------------------
	public void setSize(double r, double l){
		length=l;
		radius=r;
	}
	
	public void printVolume(){
		double volume;
		volume=Math.PI*radius*radius*length;
		System.out.println("Volume of the Cylinder : "+volume); 
	}

	public void printArea(){
		double area;
		area=2*Math.PI*radius*radius+2*Math.PI*radius*length;
		System.out.println("Area of the Cylinder : "+area); 
	}


	public void setLength(double l){
		length=l;
	}

	public void setRadius(double r){
		radius=r;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getRadius(){
		return radius;
	}
	
}
