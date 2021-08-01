package com.sourav.problems;

/**
 * Sort a LinkedList
 * Problem 15 in 50 DSA Question in Udemy Course
 * 
 * @author dell
 *
 */
public class SortLinkedList {

	public static void main(String[] args) {
		//4 - 8 - 1 - 6 - 2 - 5 
		Node head = new Node(4, new Node(8, new Node(1, new Node(6, new Node(2, new Node(5))))));
		LinkedList unsortedList = new LinkedList(head);
		printList(unsortedList);
		sortList(unsortedList);
		printList(unsortedList);
	}
    
	public static void sortList(LinkedList list) {
		list.head = mergeSort(list.head);
	} 
	
	private static Node mergeSort(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node slow = head, fast = head;
		while(fast.next != null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node rightHalfHead = slow.next;
		slow.next = null;
		head = mergeSort(head);
		rightHalfHead = mergeSort(rightHalfHead);
		return mergeSortedList(head, rightHalfHead);
	}
	
	private static Node mergeSortedList(Node leftHead, Node rightHead) {
		Node firstPointer = leftHead;
		Node secondPointer = rightHead;
		Node lower = null;
		Node returnedHead = null;
		Node tail = null;
		
		while (firstPointer != null || secondPointer != null) {
			if (firstPointer != null && secondPointer != null) {
				if (firstPointer.data > secondPointer.data) {
					lower = secondPointer;
					secondPointer = secondPointer.next;
				} else {
					lower = firstPointer;
					firstPointer = firstPointer.next;
				}
			} else if (firstPointer != null) {
				lower = firstPointer;
				firstPointer = firstPointer.next;
			} else if (secondPointer != null) {
				lower = secondPointer;
				secondPointer = secondPointer.next;
			}
			if (returnedHead == null) {
				returnedHead = lower;
				tail = lower;
			} else {
				tail.next = lower;
				tail = tail.next;
			}
		}
		
		return returnedHead;
	}
	
	private static void printList(LinkedList list) {
		Node temp = list.head;
		while(temp!=null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}
	
    static class Node{
        int data;
            Node next;
            Node(int data){this.data = data; this.next = null;}
            Node(int data, Node next){this.data = data; this.next = next;}
        }
      
        static class LinkedList{
            Node head;
            LinkedList(){this.head = null;}
            LinkedList(Node head){this.head = head;}
        }
}
