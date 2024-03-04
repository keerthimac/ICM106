class Shape{
	String name;
	String type;
	public void print(){
		System.out.println("Shape Name:"+name);
		System.out.println("Shape Type:"+type);
		System.out.println();
	}
}

class TwoDimentionalShape extends Shape{
	TwoDimentionalShape (){
		type = "Two Dimentional Shape";
	}
}

class Circle extends TwoDimentionalShape{
	Circle (){
		name = "Circle";
	}
}

class Squre extends TwoDimentionalShape{
	Squre (){
		name = "Squre";
	}
}

class Triangle extends TwoDimentionalShape{
	Triangle (){
		name = "Triangle";
	}
}


class ThreeDimentionalShape extends Shape{
	ThreeDimentionalShape(){
		type = "Three Dimentional Shape";
	}
}

class Sphere extends ThreeDimentionalShape{
	Sphere(){
		name = "Sphere";
	}
}

class Cube extends ThreeDimentionalShape{
	Cube(){
		name = "Cube";
	}
}

class Tetrahedron extends ThreeDimentionalShape{
	Tetrahedron(){
		name = "Tetrahedron";
	}
}

class Demo{
	public static void main(String args[]){
		Shape c1 =new Circle();
		c1.print();
		Shape d1 =new Squre();
		d1.print();
		Shape e1 =new Triangle();
		e1.print();
		Shape f1 =new Sphere();
		f1.print();
		Shape g1 =new Cube();
		g1.print();
		Shape h1 =new Tetrahedron();
		h1.print();
	}	
}
