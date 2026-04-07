package basic;

public class LLOperation {
	Node head;
	
	//Front Insertion
	public void insertFront(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}	
	//Last Insertion
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	public void printList() {
		if(head == null) {
			System.out.println("Linked List is Empty.");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	public void deleteFront() {
		if(head == null) {
			return;
		}
		head = head.next;	
	}
	public void deleteLast() {
	    if (head == null) 
	    	return;
	    if (head.next == null) {
	        head = null;
	        return;
	    }
	    Node temp = head;
	    Node pre = null;
	    while (temp.next != null) { 
	        pre = temp;             
	        temp = temp.next;       
	    }
	    pre.next = null;
	}
	public void middleInsert(String data, String pos) {
	    if (head == null) return;

	    if (head.data.equals(pos)) {
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	        return;
	    }

	    Node prev = head;
	    Node cur = head.next;

	    while (cur != null) {
	        if (cur.data.equals(pos)) {
	            Node newNode = new Node(data);
	            prev.next = newNode;
	            newNode.next = cur;
	            return;
	        }
	        prev = cur;
	        cur = cur.next;
	    }
	}


}
