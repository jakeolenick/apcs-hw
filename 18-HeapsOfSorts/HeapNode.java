public class HeapNode extends Node{

    protected HeapNode parent;
    protected int id;
    protected Heap heap;

    public HeapNode(Object d, Node p, Node l, Node r, int num){
	super(d,l,r);
	l = (HeapNode)l;
	r = (HeapNode)r;
	parent = p;
	if (p.getLeft() == null || (p.getLeft() != null && p.getRight != null))
	    p.setLeft(this);
	else
	    p.setRight(this);
	id = num;
    }
    public HeapNode(Object d, Node p){
	super(d);
	parent = p;
	if (p.getLeft() == null || (p.getLeft() != null && p.getRight != null))
	    p.setLeft(this);
	else
	    p.setRight(this);
    }
    public HeapNode(Object d, int num){
	super(d);
	id = num;
    }
    public HeapNode(Object d){
	super(d);
    }
    
    public int getID(){	return id; }
    public Node getParent(){ return parent; }

    public void setID(int n){
	id = n;
    }
    public void setParent(Node p){
	parent = p;	
	if (p.getLeft() == null || (p.getLeft() != null && p.getRight != null))
	    p.setLeft(this);
	else
	    p.setRight(this);
    }
    public void setLeft(Node l){
	super.setLeft(l);
	l = (HeapNode)l;
    }
    public void setRight(Node r){
	super.setRight(r);
	r = (HeapNode)r;
    }


	    
    
}