package com.sourav.problems;

/**
 * Given a linkedlist of integers, create a function that reverses it in-place
 * without using additional data structure
 * 
 * @author dell
 *
 */
public class ReverseLinkedList {

	public static void main(String[] args) {
		Node last = new Node(7);
		Node fourth = new Node(4, last);
		Node third = new Node(6, fourth);
		Node second = new Node(3, third);
		Node head = new Node(5, second);
		LinkedList list = new LinkedList(head);
		printList(list);
		reverseList(list);
		printList(list);
	}
	
	private static void reverseList(LinkedList list) {
		Node previous = null;
		Node current = list.head;
		while(current!=null) {
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		list.head = previous;
	}
	
	private static void printList(LinkedList list) {
		Node temp = list.head;
		while(temp!=null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	static class LinkedList {
		Node head;

		LinkedList() {
			this.head = null;
		}

		LinkedList(Node head) {
			this.head = head;
		}
	}

}
