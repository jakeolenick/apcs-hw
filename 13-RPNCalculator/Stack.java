import java.io.*;
import java.util.*;

public class Stack {

    private double[] items;
    private int top;

    public Stack (){
	items = new double[10];
	top = -1;
    }

    public void push(double s){
	items[top+1] = s;
	top++;
	int l = items.length;
	if (top > l - 1){
	    items = new double[l+10];
	}
    }

    public double pop(){
	double s = items[top];
	items[top] = 0.0;
	top--;
	return s;
    }

    public double peek(){
	return items[top];
    }

    public boolean isEmpty(){
	return top == -1;
    }

    public int getSize(){
	return items.length;
    }

    public String toString(){
	return Arrays.toString(Arrays.copyOfRange(items,0,top+1));
    }
}
    
