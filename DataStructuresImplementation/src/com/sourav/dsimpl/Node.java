package com.sourav.dsimpl;

public class Node<T> {
	
	private Node<T> leftChild;
	private Node<T> rightChild;
	private T data;
	private Node<T> parentNode;
	
	public Node(T data, Node<T> parentNode) {
		this.data = data;
		this.parentNode = parentNode;
	}
	
	public Node<T> getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}
	public Node<T> getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getParentNode() {
		return parentNode;
	}
	public void setParentNode(Node<T> parentNode) {
		this.parentNode = parentNode;
	}
	
	
	

}
