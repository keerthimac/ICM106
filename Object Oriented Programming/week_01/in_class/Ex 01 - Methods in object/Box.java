class Box{
	//--------------------Attribute declaration-------------------------
	int length;
	int width;
	int height;
	//--------------------Method declaration----------------------------
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box b1 : "+volume); 
	}
	
	public void printArea(){
		int area;
		area=(length*width*2)+(length*height*2)+(width*height*2);
		System.out.println("Volume of the box b1 : "+area); 
	}
}
