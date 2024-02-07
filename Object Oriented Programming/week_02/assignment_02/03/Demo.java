class PatientQueue{
	private int nextIndex;
	private Patient[] objectArray;
	
	PatientQueue(){
		nextIndex=0;
		objectArray = new Patient[0];
	}
	private boolean isFull(){
		return nextIndex>=objectArray.length;
	}

	private boolean isEmpty(){
		return nextIndex<=0;
	}
	
	private void extendArray(){
		Patient[] temp = new Patient[objectArray.length+1];
		for (int i = 0; i < nextIndex; i++){
			temp[i]=objectArray[i];
		}
		objectArray=temp;
	}
	
	public void enQueue(Patient obj){
		if (isFull()){
			extendArray();
		}
		objectArray[nextIndex++] = obj;
	} 

	public Patient deQueue(){
		Patient firsePatient = objectArray[0];
		if (!isEmpty()){
			for (int i = 0; i < nextIndex-1; i++){
				objectArray[i]=objectArray[i+1];
			}
			nextIndex--;
		}
		return firsePatient;
	} 

	public void printQueue(){
		System.out.print("{");
		for (int i = 0; i < nextIndex; i++){
			System.out.print("["+objectArray[i].getNo()+"-"+objectArray[i].getName()+"], ");
		}
		System.out.println(nextIndex==0?"empty}":"\b\b}");
	}
	public int size(){
		return nextIndex;
	} 	
	public void clear(){
		nextIndex=0;
	} 


}
class Patient{
	private int no;
	private String name;
	
	Patient(int no, String name){
		this.no = no;
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public int getNo(){
		return no;
	}
	
	public String getPatientDetail(){
		String strNo = String.valueOf(no);
		
		return "["+strNo+"-"+name+"]";
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
