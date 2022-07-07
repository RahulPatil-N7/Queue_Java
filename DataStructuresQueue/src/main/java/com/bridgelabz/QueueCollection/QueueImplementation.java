package com.bridgelabz.QueueCollection;


public class QueueImplementation {

	private Node front;
	private Node rear;
	
	public QueueImplementation() {
		this.rear = rear;
	}
	
	//method to push elements into queue
	void enQueue(int element) {
		Node node = new Node();
		node.data= element;
		if(front==null) {
			front = node;
			rear = node;
		}
		else {
			node.next=rear;
			rear=node;
		}
	}
	
	
	//method to display elements of queue
	void display() {
		if(front==null)
			System.out.println("Queue is empty.");
		else {
			Node temp= rear;
			while(temp.next!=null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	
}



