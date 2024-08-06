
public class MyList {
	Node head;
	
	void add(int data) {
		//Create node object
		
		Node newNode = new Node();
		newNode.data = data;
		newNode.address = null;
		
		if(head==null) {
			head = newNode;
		}
		
		else {
			Node temp = head;
			while(temp.address!=null) {
				temp = temp.address;
			}
			//add new node
			
			temp.address = newNode;
		}
	}
	
	void displayInfo() {
		Node current = head;
		if(current == null) {
			System.out.println("List is empty!");
		}
		
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.address;
		}
		
	}
	
	void remove(int data) {
		if(head.data==data) {
			head = head.address;
		}
		
		else {
			Node previousNode = head;
			Node currentNode = head;
			while(currentNode.address!=null) {
				previousNode = currentNode;
				currentNode = currentNode.address;
				if(currentNode.data==data) {
					previousNode.address = currentNode.address;
				}
			}
		}
	}
}
