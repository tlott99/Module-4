package com.travis;

import sun.awt.image.ImageWatched;

public class Main {

    public static void main(String[] args) {
       ILinkedList<String> linkedList = new LinkedList<String>();
       linkedList.initializeList("Food", 1);
       linkedList.append("Pizza", 2);
       linkedList.append("Chicken", 3);
       linkedList.append("Bacon", 4);
       linkedList.append("Turkey", 5);
       linkedList.append("Ham", 6);
       linkedList.append("Rice", 7);
       linkedList.append("Burrito", 8);
       linkedList.append("Taco", 9);
       linkedList.append("Cheese", 11);
       linkedList.append("Salmon", 12);
       linkedList.append("Halibut", 13);
       linkedList.append("Tuna", 14);
       linkedList.append("Lasagna", 15);
       linkedList.append("Broccoli", 16);
       linkedList.append("Cauliflower", 17);
       linkedList.append("Carrots", 18);
       linkedList.append("Macaroni and Cheese", 19);
       linkedList.append("Hamburger", 20);
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
       linkedList.insertAfter("French Fries", 2, 1);
       theNode = linkedList.getHead();
       while(theNode != null){
           System.out.println(theNode);
           theNode = theNode.getNext();
       }
       linkedList.reverseLinkedList();
       INode<String> theExtraNode = linkedList.getHead();
       while (theExtraNode != null){
            System.out.println(theExtraNode);
            theExtraNode = theExtraNode.getNext();
        }
    }
}
