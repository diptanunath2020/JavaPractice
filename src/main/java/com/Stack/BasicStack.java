package com.Stack;

import java.util.ArrayList;

public class  BasicStack <X> implements Stack<X> {


    private ArrayList<X> data;
    private int stackPointer;

    public BasicStack(){

        data=new ArrayList<X>();
        stackPointer=0;
    }

    public void push(X newItem){
        data.add(newItem);
        stackPointer++;

    }



    public X pop(){
        if (stackPointer==0){
            throw new IllegalStateException("No more items in Stack");
        }
        return data.remove(--stackPointer);
    }


    public boolean contains(X item){
        boolean found=false;
       for(int i=0;i<stackPointer;i++){
           if (data.get(i)==item){
               found=true;
               break;
           }
       }
       return found;
    }

    public X access(X item){
            while(stackPointer>0){
                X tmpItem=pop();
                if (tmpItem.equals(item)){
                    return tmpItem;
                }
            }
            throw new IllegalStateException("Couldnt find item in stack"+item);
    }
    public int size(){
        return stackPointer;
    }
}