import java.io.*;
import java.util.*;

public class Stack {

    private String[] items;
    private int top;

    public Stack (){
	items = new String[10];
	top = 0;
    }

    public void push(String s){
	items[top] = s;
	top++;
	int l = items.length;
	if (top > l - 1){
	    items = new String[l+10];
	}
    }

    public String pop(){
	String s = items[top];
	items[top] = "";
	top--;
	return s;
    }

    public String peek(){
	return items[top];
    }

    public boolean isEmpty(){
	return top == 0;
    }

    public int getSize(){
	return items.length;
    }

    public String toString(){
	return Arrays.toString(Arrays.copyOfRange(items,0,top+1));
    }
}
    
