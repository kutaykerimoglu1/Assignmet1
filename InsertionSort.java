package insertionsort;

public class InsertionSort {
	
	Node head;
	Node tail;
	
	public void Push(int data) {
		
		Node node = new Node(data);
		node.next = head;
		head = node;
			
		}
		
	public int Pop() {
		
		int data = head.data;
		head.next = head;
		return data;
		
		}
	
	public int Peek() {
		
		int data = head.data;
		return data;
		
		}
	
	
	
	public static Node InsertSort(Node node) {
		
		if (node = null) {
			return null;
		}
		
		Node sorted = node;
		node = node.next;
		
		
		
		
		
	}
		
	
}
