import java.io.*;
import java.util.*;

public class Stack {

    private String[] items;
    private int top,size;

    public Stack (){
	items = new String[10];
	top = -1;
	size = 0;
    }

    public void push(String s){
	items[top+1] = s;
	top++;
	int l = items.length;
	if (top > l - 2){
	    String[] tmp = new String[l+10]; //Ling reminded me to add this:
	    for (int i = 0; i < l; i++){
		tmp [i] = items[i];
	    }
	    items = tmp;
	}
	size++;
    }
    
    public String pop(){
	String s = items[top];
	items[top] = "";
	top--;
	size--;
	return s;
    }

    public String peek(){
	return items[top];
    }

    public boolean isEmpty(){
	return top == -1;
    }

    public int getSize(){
	return size;
    }

    public String toString(){
	return Arrays.toString(Arrays.copyOfRange(items,0,top+1));
    }
}
    
