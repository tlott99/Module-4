package com.travis;

public class LinkedList<T> implements ILinkedList<T>{
    private INode<T> head;
    @Override
    public void initializeList(T data, int id) {
        if(head == null){
            head = new Node(data, id);
        }
    }

    @Override
    public void append(T data, int id) {
        Node<T> newNode = new Node<T>(data, id);
        if(head == null){
            head = newNode;
        }
        INode<T> currentNode = head;
        while (currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
    }

    @Override
    public INode<T> getHead() {
        return this.head;
    }

    @Override
    public INode<T> findNode(int id) {
        if (head == null) {
            return null;
        }
        INode<T> currentNode = head;
        while (currentNode.getNext() != null && currentNode.getId() != id){
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    @Override
    public void removeNode(int id) {
        if (head == null){
            return;
        }
        INode<T> currentNode = head;
        INode<T> previousNode = null;
        INode<T> nextNode = null;
        while (currentNode.getNext() != null && currentNode.getId() != id){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            nextNode = currentNode.getNext();
        }
        if (nextNode != null){
            previousNode.setNext(nextNode);
        }
        currentNode.setNext(null);
        currentNode = null;
    }

    @Override
    public void insertAfter(T data, int id1, int id2) {
        if (head == null) {
            return;
        }
        INode<T> currentNode = head;
        Node<T> newNode = new Node(data, id1);
        while(currentNode != null){
            if(currentNode.getId() == id2){
                newNode.setNext(currentNode.getNext());
                currentNode.setNext(newNode);
                break;
            }
            else {
                currentNode = currentNode.getNext();
            }
        }
    }

    @Override
    public void reverseLinkedList() {
        INode<T> previousNode = null;
        INode<T> currentNode = head;
        INode<T> nextNode = null;
        while(currentNode != null){
          nextNode = currentNode.getNext();
          currentNode.setNext(previousNode);
          previousNode = currentNode;
          currentNode = nextNode;
        }
        head = previousNode;
    }
}
