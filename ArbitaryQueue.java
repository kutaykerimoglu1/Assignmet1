package arbitaryqueue;

public class ArbitaryQueue {
	
	Node head;
	Node tail;
	Node next;
	
	
	public ArbitaryQueue() {
		
		head = null;
	}
	
	public void Push(String data) {
		
		Node node = new Node(data);
		node.next = head;
		head = node;
		
	}
	
	public void Enqueue(String data) {
		
		Node node = new Node(data);
		
		if (tail != null) {
			tail.next = node;
			}
		
		tail = node;
		
		if (head == null) {
			head = node;
		}
		
	}
	
	public String Pop(){
		
		String data = head.data;
		head = head.next;
		return data;
		
	}
	
	public String Dequeue() {
		
		String data = tail.data;
		tail = tail.next;
		return data;
		
		
	}
	
	public String Traverse(int index, String data) {
		
		Node node = new Node(data);
		node = head;
		for (int i = 0; i < index - 1; i++) {
			node = node.next;
			}
		return node.data;
		
		
		}
	
	
}
