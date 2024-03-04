class Student{
	String name;
	boolean isPassAl;
	boolean isGraduated;
	boolean hasScholarship = true;
	public void print(){
		System.out.println("Name:"+name);
		System.out.println("Pass AL?:"+isPassAl);
		System.out.println("Graduated?:"+isGraduated);
		System.out.println("Scholarship?:"+hasScholarship);
	}
}

class GraduateStudent extends Student{
	GraduateStudent (){
		name="Darshana";
		isPassAl= true;
		isGraduated = true;
	}
}

class UndergraduateStudent extends Student{
	UndergraduateStudent(){
		name="pubudu";
		isPassAl= true;
		isGraduated = false;
	}
}

class Demo{
	public static void main(String args[]){
		GraduateStudent s1 =new GraduateStudent();
		s1.print();
	}	
}
