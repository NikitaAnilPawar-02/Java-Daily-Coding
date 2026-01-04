class SinglyLinkedListImplementation{
	public static void main(String args[]){
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtFirst(50);
		list.insertAtFirst(60);
		list.insertAtFirst(90);
		list.insertAtFirst(100);
		list.deleteAtFirst();
		list.deleteAtFirst();
		list.deleteAtEnd();
		list.deleteAtGivenPosition(3);
		list.printList();
		System.out.println("List size: "+list.size());
		System.out.println("Is List Empty: "+list.isEmpty());
	}
}

class Node{
	int data;
	Node next;
	Node(int data){	
		this.data = data;
		this.next = null;
	}
}

class SinglyLinkedList{
	Node head;

	void insertAtEnd(int data){
		Node newNode = new Node(data);
		
		if(isEmpty()){
			head = newNode;
			return;
		}
	
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = newNode;		
	}

	void insertAtFirst(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	void insertAtGivenPosition(int position, int data){
		 if (position < 1) {
        		System.out.println("Invalid position");
        		return;
    		}

		if(position == 1){
			insertAtFirst(data);
			return;
		}

		Node newNode = new Node(data);
		int count = 1; 
		Node temp = head;
	
		while(temp != null && count < position -1){
			temp = temp.next;
			count++;
		}

		if(temp == null){
			System.out.println("Position out of range");
			return;
		}

		newNode.next = temp.next;
		temp.next = newNode;		
	}

	void deleteAtFirst(){
		if(isEmpty()){
			System.out.println("LinkedList is empty");
			return;
		}

		head = head.next;
	}

	void deleteAtEnd(){
		if(isEmpty()){
			System.out.println("LinkedList is empty");
			return;
		}

		if(head.next == null){
			head = null;
			return;
		}

		Node temp = head;
		Node prev= null;

		while(temp.next != null){
			prev = temp;
			temp = temp.next;
			
		}
		
		prev.next = null;
	}

	void deleteAtGivenPosition(int position){
		if(position<1){
			System.out.print("Invalid position");
			return;
		}

		if(position ==1){
			deleteAtFirst();
			return;
		}

		Node temp = head;
		int count = 1;
		while(temp.next!=null && count < position -1){
			temp = temp.next;
			count++;
		}
	
		if(temp ==null || temp.next ==null){
			System.out.print("Position out of range");
			return;
		}

		temp.next = temp.next.next;
	}

	int size(){
		int count = 0;
		Node temp = head;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}

	boolean isEmpty(){
		return head== null;
	}

	void printList(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
		
}



