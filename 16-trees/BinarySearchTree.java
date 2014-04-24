import java.io.*;
import java.util.*;

public class BinarySearchTree extends Tree{


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
	