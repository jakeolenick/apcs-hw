import java.io.*;
import java.util.*;

public class Queue{ //wrapping queue

    private int head,tail;
    private Object[] data;
    private int numItems;

    public Queue(){
	this(10);
    }

    public Queue(int n){
	data = new Object[n];
	head = 0;
	tail = 0;
	numItems = 0;
    }

    public void enqueue(Object n){
	if (tail == head - 1){	    
	    data[tail] = n;
	    tail = (tail + 1) % data.length;	
	    numItems++;
	    resize();
	}
	else {
	    data[tail] = n;
	    tail = (tail + 1) % data.length;	
	    numItems++;
	}
    }

    public Object dequeue(){
	if (numItems > 0){
	    Object o = data[head];
	    data[head] = null;
	    head = (head + 1) % data.length;
	    numItems--;
	    return o;
	}
	else{
	    return null;
	}
    }

    public void resize(){
	Object[] tmp = data;
	data = new Object[(data.length) * 3 / 2];
	for(int i = 0; i < tmp.length; i++){
	    data[i] = tmp[i];
	    i++;
	}
	head = 0;
	tail = numItems;
    }

    public boolean isEmpty(){
	return head == tail;
    }

    public String toString(){
	String s = "";
	for (int i = head; i != tail; i = (i + 1) % data.length){
	    s = s + data[i].toString();
	}
	return s;
	
    }
}