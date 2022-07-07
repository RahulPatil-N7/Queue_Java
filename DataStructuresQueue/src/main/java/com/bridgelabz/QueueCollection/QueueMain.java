package com.bridgelabz.QueueCollection;

import java.util.Scanner;

/* create a Queue of
* 56->30->70 and perform 
* stack operations */
public class QueueMain {
	static Scanner scanner = new Scanner(System.in);
	
	//program menu selection 
	private static int userMenu() {
		System.out.println("\nPlease enter your choice.");
		System.out.println("Press 1 to Insert");
		System.out.println("Press 2 to Dispay");
		System.out.println("Press 3 to Exit.");
		int choice = scanner.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		
		//creating queue object to call Queue functions
		QueueImplementation queue = new QueueImplementation();
		boolean flag = true;
		while(flag) {
			int choice = userMenu();
			switch(choice) {
				case 1:	System.out.println("\nEnter the element to insert to Queue :");
						int element = scanner.nextInt();
						queue.enQueue(element);
						System.out.println("\nElement "+element+" is pushed into Queue.");
						break;
				case 2: System.out.println("\nElements of Queue are :");
						queue.display();
						break;
				case 3: System.out.println("\nExiting from Queue,Thanks");
						flag = false;
						break;
				default:System.out.println("\nInvaid choice.");
			}

		}

	}
}