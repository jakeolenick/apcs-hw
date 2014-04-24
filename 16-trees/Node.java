import java.io.*;
import java.util.*;

public class Node{

    private int data;
    private Node left, right;

    public Node(int n, Node l, Node r){
	data = n;
	left = l;
	right = r;
    }
    public Node(int n){
	this.Node(n,null,null);
    }
    public Node(Node l, Node r){
	this.Node(0,l,r);
    }
    public Node(Node l){
	this.Node(0,l,null);
    }
    public Node(int n, Node l){
	this.Node(n,l,null);
    }

    public int getData(){ return data; }
    public Node getLeft(){ return left; }
    public Node getRight(){ return right; }

    public void setData(int n){	data = n; }
    public void setLeft(Node n){ left = n; }
    public void setRight(Node n){ right = n; }

    