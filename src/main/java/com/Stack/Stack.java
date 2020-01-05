package com.Stack;

public interface Stack<X> {

    abstract void push(X item);
    abstract X pop();
    abstract boolean contains(X item);
    abstract X access(X item);
    abstract int size();

}
