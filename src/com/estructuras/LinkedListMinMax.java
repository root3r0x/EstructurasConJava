package com.estructuras;

public class LinkedListMinMax {

	/**
	 * @param args
	 */
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	static Node findMinNode(Node head) {
		if (head==null) {
			return null;
		}
		Node minNode = head;
		while(head!=null) {
			if (head.data < minNode.data) {
				minNode = head;
			}
			head = head.next;
		}
		return minNode;
	}
	
	static Node findMaxNode(Node head) {
		if (head==null) {
			return null;
		}
		Node maxNode = head;
		while (head!=null) {
			if (head.data > maxNode.data) {
				maxNode = head;
			}
			head = head.next;
		}
		return maxNode;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(5);
		head.next.next.next = new Node(30);
		
		Node minNode = findMinNode(head);
		Node maxNode = findMaxNode(head);
		
		System.out.println("Minimum value node: " + minNode.data);
		System.out.println("Maximum value node: " + maxNode.data);
	}
}