import java.io.*;
import java.util.*;

public class Tree{

    private Node root, current;
    protected int height;

    public Tree(Node root){
	this.root = root;
	current = root;
	height = 1;
    }
    public Tree(int x){
	this(new Node(x));
    }
    public Tree(){
	this(null);
	height = 0;
    }

    public Node insert(Node n, Node here){ 
	if (here.getLeft() == null){ 
	    here.setLeft(n);
	}
	else if (here.getRight() == null){
	    here.setRight(n);
	}
	else{
	    insert(n,here.getLeft());
	}
	return n;
    }

    public Node insert(Node n){
	return insert(n,root);
    }

    public void print(Node n){
        if (n == null){
            return;
        }
        else{
            print(n.getRight());
            System.out.println(n);
            print(n.getLeft());
        }
    }

    public void print(){
	print(root);
    }

}