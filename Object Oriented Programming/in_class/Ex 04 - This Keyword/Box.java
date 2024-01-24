class Box{
	//-------------Attribute declarations-------
	int length;
	int width;
	int height;
	
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

	public void setSize(int length, int width, int height){
		this.length=length; //length=length is wrong because its refer current value 0 assigning again
		this.width=width; //width=width; is wrong because its refer current value 0 assigning again
		this.height=height; //height=height; is wrong because its refer current value 0 assigning again
		System.out.println(this);
		
		// inorder to set to currnet declared object, we need to 
	}
}


