package training;

public class CircularQueue {
	
	private int[] queue1;
	private int first;
	private int last;
	private int sizeOfArray;

	public CircularQueue (int size){
		this.queue1 = new int[size];
		this.initialize();
		this.sizeOfArray = size;
		this.first = 0;
		this.last = 0;
	}
	
	private void initialize(){
		for(int i=0; i<sizeOfArray; i++){
			queue1[i]=0;
		}
	}
	
	public void push(int toPush){
		queue1[last]=toPush;
		System.out.println("last is: " + last);
		last = (last+1)%sizeOfArray; 
		System.out.println("last is now: " + last);
	}
	
	public int pop(){
		int popInt = queue1[first];
		queue1[first]=0;
		System.out.println("first is: " + first);
		first = (first-1)%sizeOfArray;
		System.out.println("first is now: " + first);
		return popInt;
	}
}
