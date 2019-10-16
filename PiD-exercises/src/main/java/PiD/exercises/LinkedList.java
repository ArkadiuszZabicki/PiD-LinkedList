package PiD.exercises;

class Node {
	
	int elem;
	Node next;
	
	Node(int elem, Node next) {
		this.elem = elem;
		this.next = next;
	}
}

public class LinkedList {
	
	Node first = null;
	
	public void add(int elem) {
		if(first == null) {
			//means that list is empty
			Node n = new Node(elem, null);
			first = n;
		}
		else {
			
			
			//1. step: find last node!
			// last node is the node where next == null!
			Node current = first;
			while(current.next != null) {
				current = current.next;
			}
			//here we know: current is the last node
			// because current.next == null;
			Node last = current;
			last.next = new Node(elem, null);
		}
	}
	
	public int get(int index) {
		//2 cases
		if(first == null) {
			//list is empty
			//case 1: zero element
			//IndexOutOfBound Exception
			throw new IndexOutOfBoundsException();
		}
		
		else {
			//case 2: at least one element
			// can use "next" field
			int counter = 0;
			Node current = first;
			
			while(current.next != null && counter < index) {
				current = current.next;
				counter++;
			}
			if(counter == index) {
				return current.elem;
			}
			else {
				throw new IndexOutOfBoundsException();
			}
			//Add size method;
		}
		
		
	}

}
