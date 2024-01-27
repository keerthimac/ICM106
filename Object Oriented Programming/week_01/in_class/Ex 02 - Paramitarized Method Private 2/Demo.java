class Demo{
	public static void main(String args[]){
		Cylinder c1=new Cylinder();
		c1.setSize(5.5, 12.5); //
		c1.printVolume();
		c1.printArea();
		
		c1.setRadius(10.0);
		c1.setLength(15.0);
		
		System.out.println("Length : "+c1.getLength());
		System.out.println("Radius : "+c1.getRadius());
	}
}
//Volume=Math.PI*radius*radius*length
//Area=2*Math.PI*radius*radius+2*Math.PI*radius*length




