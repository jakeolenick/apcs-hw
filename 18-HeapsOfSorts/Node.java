import java.io.*;
import java.util.*;

public class Node{

    protected Object data;
    protected Node left, right;

    public Node(Object d, Node l, Node r){
	data = d;
	left = l;
	right = r;
    }
    public Node(Object n){
	this(n,null,null);
    }
    public Node(Node l, Node r){
	this(0,l,r);
    }
    public Node(Node l){
	this(0,l,null);
    }
    public Node(Object n, Node l){
	this(n,l,null);
    }

    public String toString(){ return "" + data; }
    public int getData(){ return data; }
    public Node getLeft(){ return left; }
    public Node getRight(){ return right; }

    public void setData(int n){	data = n; }
    public void setLeft(Node n){ left = n; }
    public void setRight(Node n){ right = n; }

    public boolean isLeaf(){
	return (left == null && right == null);
    }
}
    