class PatientQueue{
	private Node front;
	
	public void enQueue(Patient patient){
		Node n1 = new Node(patient);
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

	public Patient deQueue(){
		Node temp = front;
		front = front.next;
		return temp.patient;
	}

	public void printQueue(){
		Node temp = front;
		System.out.print("{");
		while(temp!=null){
			System.out.print("["+temp.patient.num+"-"+temp.patient.name+"], ");
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
	Patient patient;
	Node next;
	Node(Patient patient){
		this.patient=patient;
	}
}

class Patient{
	int num;
	String name;	
	Patient(int num, String name){
		this.num= num;
		this.name= name;
	}
	public String getPatientDetail(){
		String number = String.valueOf(num);
		return "["+num+"-"+name+"]";
	}
}
	

class Demo{
	public static void main(String args[]){
		PatientQueue queue=new PatientQueue();
		queue.enQueue(new Patient(101,"Amal"));
		queue.enQueue(new Patient(102,"Nimal"));
		queue.enQueue(new Patient(103,"Ramal"));
		queue.enQueue(new Patient(104,"Bimal"));
		queue.printQueue(); //{[101-Amal], [102-Niaml], [103-Ramal], [104-Bimal]}
		Patient firstPatient= queue.deQueue();
		System.out.println(firstPatient.getPatientDetail()); //[1001-Amal]
		queue.printQueue(); //{[102-Niaml], [103-Ramal], [104-Bimal]}
		System.out.println("No of patient of the queue : "+queue.size()); //3
		queue.clear();
		queue.printQueue(); //{Empty}
		System.out.println("No of patient of the queue : "+queue.size()); //0
	}
}
