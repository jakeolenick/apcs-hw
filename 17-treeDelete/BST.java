import java.io.*;
import java.util.*;

public class BST extends Tree{

    public BST(int x){
	super(x);
    }
    public BST(Node n){
	super(n);
    }
    public BST(){
	super();
    }

    public Node search(int x){
	boolean found = false;
	Node current = root;
	while (!found && current != null){
	    if (current.getData() == x)
		return current;
	    else if (current.getData() > x)
		current = current.getLeft();
	    else
		current = current.getRight();
	}
	return null;
    }

    public Node insert(Node n){ //add a new node where it goes
	Node preCurrent = null;
	boolean isRight = true;
	while (!found && current != null){
	    if (current.getData() == x)
		preCurrent = current;
		found = true;
	    else if (current.getData() > x){
		preCurrent = current;
		isRight = false;
		current = current.getLeft();
	    }
	    else{
		preCurrent = current;
		isRight = true;
		current = current.getRight();
	    }
	}
	if (isRight){	    
	    preCurrent.setRight(n);
	    return preCurrent.getRigh();
	}
	else{
	    preCurrent.setLeft(n);
	    return preCurrent.getLeft();
	}
    }
	
    public Node search2(Node c, int x){
	if (c.getLeft() == null && c.getRight() == null){
	    if (c.getData() == x)
		return c;
	    else
		return null;
	}
	if (c.getData() == x)
	    return c;
	else if (c.getData() > x)
	    search2(c.getLeft(), x);
	else if (c.getData() < x)
	    search2(c.getRight(),x);
    }

    public void delete(int x){
	//finding the desired node
	Node pre;
	Node goal;
	boolean isRight
	//deleting it
	if(goal.getLeft() != null){
	    if (isRight) pre.setRight(goal.getRight());
	    else pre.setLeft(goal.getRight);
	}
	else if (goal.getLeft() !=  
	

    }
}