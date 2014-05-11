public class HeapNode extends Node{

    protected HeapNode parent;
    protected int id;

    public HeapNode(int d, Node p, Node l, Node r, int num){
	super(d,l,r);
	l = (HeapNode)l;
	r = (HeapNode)r;
	parent = (HeapNode)p;
	if (p.getLeft() == null || (p.getLeft() != null && p.getRight() != null))
	    p.setLeft(this);
	else
	    p.setRight(this);
	id = num;
    }
    public HeapNode(int d, Node p){
	super(d);
	parent = (HeapNode)p;
	if (p.getLeft() == null || (p.getLeft() != null && p.getRight() != null))
	    p.setLeft(this);
	else
	    p.setRight(this);
    }
    public HeapNode(int d, int num){
	super(d);
	id = num;
    }
    public HeapNode(int d){
	super(d);
    }
    
    public int getID(){	return id; }
    public HeapNode getParent(){ return parent; }
    public HeapNode getLeft(){ return (HeapNode)left; }
    public HeapNode getRight(){ return (HeapNode)right; }

    public boolean hasParent(){ return (parent != null); }

    public void setID(int n){
	id = n;
    }
    public void setParent(HeapNode p){
	parent = p;	
	// if (p.getLeft() == null || (p.getLeft() != null && p.getRight != null))
	//     p.setLeft(this);
	// else
	//     p.setRight(this);
    }
    public void setLeft(HeapNode l){
	if (l != null){
	    super.setLeft(l);
	    l.setParent(this);
	}
    }
    public void setRight(HeapNode r){
	if (r != null){
	    super.setRight(r);
	    r.setParent(this);
	}
    }

    public void swap(HeapNode other){
	HeapNode tmp1 = this;
	HeapNode tmp2 = other;
	this.setParent(tmp2.getParent());
	this.setLeft(tmp2.getLeft());
	this.setRight(tmp2.getRight());
	this.setID(tmp2.getID());
	this.setData(tmp2.getData());
   	other.setParent(tmp1.getParent());
	other.setLeft(tmp1.getLeft());
	other.setRight(tmp1.getRight());
	other.setID(tmp1.getID());
	other.setData(tmp1.getData());
    }
}