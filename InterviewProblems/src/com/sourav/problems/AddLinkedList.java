/**
 * 
 */
package com.sourav.problems;

/**
 * @author dell
 *
 */
public class AddLinkedList {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList(new Node(3,new Node(2,new Node(1))));
		LinkedList list2 = new LinkedList(new Node(5,new Node(9,new Node(4,new Node(3)))));
		
		LinkedList list3 = new LinkedList(new Node(5,new Node(2,new Node(6,new Node(8)))));
		LinkedList list4 = new LinkedList(new Node(1,new Node(7,new Node(5,new Node(6)))));
		
		LinkedList list5 = new LinkedList(new Node(5));
//		LinkedList list5 = new LinkedList(new Node(5));
		
		LinkedList sum = addTwoLinkedLists(list1, list2);
		LinkedList sum2 = addTwoLinkedLists(list3, list4);
		LinkedList sum3 = addTwoLinkedLists(list5, list5);
		printLinkedList(list1);
		printLinkedList(list2);
		printLinkedList(sum);
		printLinkedList(sum2);
		printLinkedList(sum3);
	}
	
	public static LinkedList addTwoLinkedLists(LinkedList list1, LinkedList list2) {
		LinkedList sum = new LinkedList(new Node(0));
		Node sumHead = sum.head;
		Node head1 = list1.head;
		Node head2 = list2.head;
		int carry = 0;
		while(head1!=null || head2!=null) {
			
			if(head2 != null && head1 == null) {
				System.out.println("Inside 1");
				sumHead.data = head2.data + carry;
				head2 = head2.next;
			}else if (head1 != null && head2 == null) {
				System.out.println("Inside 2");
				sumHead.data = head1.data + carry;
				head1 = head1.next;
			}else if(head2 != null && head1 != null){
				System.out.println("Inside 3");
				sumHead.data = head1.data + head2.data + carry;
				head1 = head1.next;
				head2 = head2.next;
			}
			
			carry = 0;
			if(sumHead.data >= 10) {
				carry = sumHead.data / 10;
				sumHead.data = sumHead.data % 10;
			}
			
			System.out.println("Data : " + sumHead.data);
			System.out.println("carry : " + carry);
			
			if(head1!=null || head2!=null) {
				Node newNode = new Node(0);
				sumHead.next = newNode;
				sumHead = newNode;
			}
			
			if(carry!=0) {
				Node newNode = new Node(carry);
				sumHead.next = newNode;
			}
		}
		return sum;
	}
	
	private static void printLinkedList(LinkedList list) {
		Node head = list.head;
		while(head!=null) {
			System.out.print(head.data + " -> ");
			head = head.next;
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
