
public class MyQueue {
	int queue[];
	int size;
	int count = 0;
	
	MyQueue(int size){
		this.size= size;
		queue = new int[size];
	}
	
	void Enqueue(int val) {
		if(count == size) {
			System.out.println("Queue is out of bound");
		}
		
		else {
			queue[count] = val;
			count++;
		}
	}
	
	void displayInfo() {
		if(count == 0) {
			System.out.println("Queue is empty");
		}
		
		else {
			for(int i=0; i<count; i++) {
				System.out.println(queue[i]);
			}
		}
	}
	
	void Dequeue() {
		if(count==0) {
			System.out.println("Queue is empty");
		}
		
		else {
			for(int i=0; i<count; i++) {
				queue[i] = queue[i+1];
			}
			count--;
		}
	}
}
