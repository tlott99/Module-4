package com.travis;

public class Main {

    public static void main(String[] args) {
       ILinkedList<String> linkedList = new LinkedList<String>();
       linkedList.initializeList("food", 1);
       linkedList.append("pizza", 2);
       linkedList.append("chicken", 3);
        linkedList.append("chicken2", 4);
        linkedList.append("chicken3", 5);
        linkedList.append("chicken4", 6);
        linkedList.append("chicken5", 7);
        linkedList.append("chicken6", 8);
        linkedList.append("chicken7", 9);
        linkedList.append("chicken8", 11);
        linkedList.append("chicken9", 10);
       INode<String> theNode = linkedList.getHead();
       while(theNode != null){
           System.out.println(theNode);
           theNode = theNode.getNext();
       }
       INode<String> foundNode = linkedList.findNode(3);
       System.out.println(foundNode);
       linkedList.removeNode(2);
       theNode = linkedList.getHead();
       while (theNode != null){
           System.out.println(theNode);
           theNode = theNode.getNext();
       }
       linkedList.insertAfter("pizza", 2, 1);
       theNode = linkedList.getHead();
       while(theNode != null){
           System.out.println(theNode);
           theNode = theNode.getNext();
       }
       /*linkedList.reverseLinkedList();
       theNode = linkedList.getHead();
       while (theNode != null){
            System.out.println(theNode);
            theNode = theNode.getNext();
        }*/

    }
}
