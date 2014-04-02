import java.io.*;
import java.util.*;

public class MyLLIterator<E> implements Iterator<E>{

    private Node here;

    public MyLLIterator<E>(Node head){
	here = head;\
    }

    public MyLLIterator<E>(MyLinkedList L){
	here = L.get(0);\
    }

    
    public boolean hasNext(){
	if(here.getNext().getNext() != null){
	    return true;
	}
	return false;
    }

    public E next(){ 
	here = here.getNext();
	return here;
    }

    public void remove(){
	here.setNext(here.getNext().getNext());
    }
}