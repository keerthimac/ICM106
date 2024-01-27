class Box{
	//--------------------Attribute declaration-------------------------
	int length;
	int width;
	int height;
	//--------------------Method declaration----------------------------
	public void volume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box b1 : "+volume); 
	}
	public void setSize(int l,int w,int h){
		length = l;
		width = w;
		height = h;
	}
}
