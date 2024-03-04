class Shape{
	double area;
	double pi = 22/7;
	
	public void print(){
		System.out.println("Area:"+area);
	}
}

class Circle extends Shape{
	double redius = 3;
	Circle (){
		area = pi*redius*redius;
	}
}

class Triangle extends Shape{
	double length = 3;
	double height = 3;
	Triangle(){
		area = 0.5*length*height;
	}
}

class Rectangle extends Shape{
	double length = 3;
	double height = 3;
	Rectangle(){
		area = length*height;
	}
}

class Sphere extends Shape{
	double redius = 3;	
	Sphere(){
		area = 4*pi*redius;
	}
}

class Cube extends Shape{
	double length = 3;
	double width = 3;
	double height = 3;
	Cube(){
		area = length*width*height;
	}
}

class Demo1{
	public static void main(String args[]){
		Circle c1 =new Circle();
		c1.print();
		Triangle t1 =new Triangle();
		t1.print();
		Rectangle r1 =new Rectangle();
		r1.print();
		Sphere s1 =new Sphere();
		s1.print();
		Cube b1 =new Cube();
		b1.print();
	}	
}
