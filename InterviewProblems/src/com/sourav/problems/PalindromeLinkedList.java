package com.sourav.problems;

public class PalindromeLinkedList {

	public static void main(String[] args) {
//		Node last = new Node(1);
//		Node sixth = new Node(4, last);
//		Node fifth = new Node(6, sixth);
//		Node fourth = new Node(5, fifth);
//		Node third = new Node(6, fourth);
//		Node second = new Node(4, third);
//		Node head = new Node(1, second);
		
		Node last = new Node(8);
		Node fifth = new Node(2, last);
		Node fourth = new Node(4, fifth);
		Node third = new Node(-6, fourth);
		Node second = new Node(2, third);
		Node head = new Node(8, second);
		
		LinkedList list = new LinkedList(head);
		printList(list);
		System.out.println(isPalindromeList(list));
	}

	public static boolean isPalindromeList(LinkedList list) {
		Node slow = list.head;
		Node fast = list.head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		slow = reverseList(slow);
		Node head = list.head;
		while(slow!=null) {
			if(slow.data!=head.data) {
				return false;
			}
			head = head.next;
			slow = slow.next;
		}
		return true;
	}

	private static Node reverseList(Node head) {
		Node previous = null;
		Node current = head;
		while (current != null) {
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
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
