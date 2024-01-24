class Box{
	//-------------Attribute declarations-------
	int length;
	int width;
	int height;
	
	//-------------Constructor declarations-------
	/*Compiler inserts
	Box(){
		length=0;
		width=0;
		height=0;
	}
	*/
	
	//-------------Method declarations---------
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box b1 : "+volume); 
	}
	public void printArea(){
		int area;
		area=2*length*width+2*length*height+2*width*height;
		System.out.println("Area of the box b1 : "+area); 
	}
	public void setSize(int l, int w, int h){
		length=l;
		width=w;
		height=h;
	}
}

