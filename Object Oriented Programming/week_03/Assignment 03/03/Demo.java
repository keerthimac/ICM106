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

	public Student remove(){
		Node temp = front;
		front = front.next;
		return temp.student;
	}
	
	public Student get(int index){
		if (index>=0 && index<size()){
			Node temp = front;
			int count = 1;
			while(count<index){
				temp=temp.next;
				count++;
			}
			return temp.student;
		}
		return null;
	}	

	public Student remove(int index){
		if (index>=0 && index<size()){
			Node temp = front;
			int count = 0;
			while(count<index-1){
				temp=temp.next;
				count++;
			}
			Node returnObj=temp;
			while(count<index){
				temp=temp.next;
				count++;
			}
			returnObj.next=temp.next;		
			return returnObj.student;
		}
		return null;
	}

	public void printList(){
		Node temp = front;
		System.out.print("{");
		while(temp!=null){
			System.out.print("["+temp.student.code+"-"+temp.student.name+"], ");
			temp=temp.next;
		}
		System.out.println(isEmpty()?"empty}":"\b\b]");
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
		stList.add(new Student(101,"Danapala"));
		stList.add(new Student(102,"Gunapala"));
		stList.add(new Student(103,"Somapala"));
		stList.add(new Student(104,"Amarapala"));
		stList.add(new Student(105,"Siripala"));		
		stList.printList(); //{[101-Danapala], [102-Gunapala], [103-Somapala], [104-Amarapala], [105-Siripala]}
		Student s1=stList.get(2);
		System.out.println("Student of index 2: "+s1.getStudentDetails()); //[1002-Amal]
		
		Student s2= stList.remove(1);
		System.out.println("Last Removed Student: "+s1.getStudentDetails()); //[1003-Somapala]
		stList.printList();//{[101-Danapala], [103-Somapala], [104-Amarapala], [105-Siripala]}
		//System.out.println("No of Student of the queue : "+queue.size()); //3
		//stList.clear();
		//stList.printList(); //{Empty}
		//System.out.println("No of Student of the queue : "+queue.size()); //0
	}
}
