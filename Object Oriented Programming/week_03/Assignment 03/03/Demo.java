class StudentList{
	private Node front;
	
	public void add(Student student){
		Node n1 = new Node(student);
		if(isEmpty()){
			front = n1;
		}else{
			Node lastNode = front;
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			lastNode.next = n1;
		}	
	}

	public void add(int index,Student student){
		if(index>=0 && index<size()){
			Node temp=front;
			Node n1 = new Node(student);
			int count=0;
			while(count<index-1){
				temp=temp.next;
				count++;
			}
			n1.next=temp.next;
			temp.next=n1;
			
		}
	}

	public Student get(int index){
		if (index>=0 && index<size()){
			Node temp = front;
			int count = 0;
			while(count<index){
				temp=temp.next;
				count++;
			}
			return temp.student;
		}
		return null;
	}	

	public Student remove(){
		Node temp = front;
		front = front.next;
		return temp.student;
	}

	public Student remove(int index){
		if (index>=0 && index<size()){
			Node temp = front;
			int count = 0;
			while(count<index-1){
				temp=temp.next;
				count++;
			}
			Node prvObj=temp;
			while(count<index){
				temp=temp.next;
				count++;
			}
			Node curObj = temp;
			prvObj.next=temp.next;		
			return curObj.student;
		}
		return null;
	}

	public Student remove(Student student){
		if(student!=null){
			Node temp = front;
			int stuIndex = search(student);
			if (stuIndex!=-1){
				Student stuObj = remove(stuIndex);
				return stuObj;				
			}		
		}
		return null;
	}

	public int search(Student student){
		Node temp = front;
		int count =0;
		while(temp!=null){
			if(temp.student.code==student.code){		
				return count;
			}else{
				temp=temp.next;
				count++;
			}
		}
		return -1;
	}

	public void printList(){
		Node temp = front;
		System.out.print("{");
		while(temp!=null){
			System.out.print("["+temp.student.code+"-"+temp.student.name+"], ");
			temp=temp.next;
		}
		System.out.println(isEmpty()?"empty}":"\b\b}");
	}

	private boolean isEmpty(){
		return front==null;
	}

	public int size(){
		Node temp = front;
		int count = 0;
		while (temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}

	public void clear(){
		front = null;
	}

}

class Node{
	Student student;
	Node next;
	Node(Student student){
		this.student=student;
	}
}

class Student{
	int code;
	String name;	
	Student(int code, String name){
		this.code= code;
		this.name= name;
	}
	public String getStudentDetails(){
		String number = String.valueOf(code);
		return "["+code+"-"+name+"]";
	}
}
	

class Demo{
	public static void main(String args[]){
		StudentList stList=new StudentList();
		stList.add(new Student(1001,"Danapala"));
		stList.add(new Student(1002,"Gunapala"));
		stList.add(new Student(1003,"Somapala"));
		stList.add(new Student(1004,"Amarapala"));
		stList.add(new Student(1005,"Siripala"));		
		stList.printList(); //{[1001-Danapala], [1002-Gunapala], [1003-Somapala], [1004-Amarapala], [1005-Siripala]}
		Student s1=stList.get(2);
		System.out.println("Student of index 2: "+s1.getStudentDetails()); //[1003-Somapala]
		
		Student s2= stList.remove(1);
		System.out.println("Last Removed Student: "+s2.getStudentDetails()); //[1002-Gunapala]
		stList.printList();//{[1001-Danapala], [1003-Somapala], [1004-Amarapala], [1005-Siripala]}
		
		stList.add(1,new Student(1000,"Gunapala"));
		stList.printList();//{[1001-Danapala],[1000-Gunapala], [1003-Somapala], [1004-Amarapala], [1005-Siripala]}
		
		int index= stList.search(new Student(1003,"Somapala"));
		System.out.println("Index of 1003 Somapala: "+index); //2
		
		index= stList.search(new Student(1111,"Somasiri"));
		System.out.println("Index of 1111,Somasiri "+index); //-1

		Student s3= stList.remove(new Student(1000,"Gunapala"));
		System.out.println("Last Removed Student: "+s3.getStudentDetails()); //[1000-Gunapala]
		stList.printList();//{[1001-Danapala], [1003-Somapala], [1004-Amarapala], [1005-Siripala]}

	}
}
