class Box{
	//--------------------Attribute declaration-------------------------
	private int length;
	private int width;
	private int height;
	//--------------------Method declaration----------------------------
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box b1 : "+volume); 
	}
	
	public void setSize(int l, int w, int h){
		length=l;
		width=w;
		height=h;
	}

	public void printArea(){
		int area;
		area=2*length*width+2*length*height+2*width*height;
		System.out.println("Area of the box b1 : "+area); 
	}


	public void setLength(int l){
		length=l;
	}

	public void setWidth(int w){
		width=w;
	}

	public void setHeight(int h){
		height=h;
	}
	
	public int getLength(){
		return length;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
}
