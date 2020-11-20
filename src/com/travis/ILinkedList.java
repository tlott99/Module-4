package com.travis;

public interface ILinkedList<T> {
    void initializeList (T data, int id);
    void append(T data, int id);
    INode<T> getHead();
    INode<T> findNode(int id);
    void removeNode(int id);
    void insertAfter(T data, int id1, int id2);
    INode<T> reverseLinkedList();
}
