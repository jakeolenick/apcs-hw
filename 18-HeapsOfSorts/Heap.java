public class Heap extends Tree{

    private int maxID;
    private HeapNode root,current;
    
    public Heap(HeapNode r){	
	root = r;
	root = (HeapNode)root;
	current = root;
	current = (HeapNode) current;
	if (root.getParent() != null)
	    root.setParent(null);
	height = 1;
	maxID = 1;
    }
    public Heap(){
	root = new HeapNode(100,1);
	current = root;
	root = (HeapNode)root;
	current = (HeapNode)current;
	height = 1;
	maxID = 1;
    }

    public int getMaxID(){ return maxID; }
    public HeapNode getCurrent(){ return current; }

    public HeapNode get(int id, HeapNode n){
	if (id <= maxID){
	    HeapNode a = null;
	    HeapNode b = null;
	    if (n.getID() == id)
		return n;
	    else if (n.hasRight()){
		b = get(id, n.getRight());
	    }
	    else if (n.hasLeft()){
		System.out.println(n.getLeft());
		// a = get(id, n.getLeft());
	    }
	    else
		return null;
	    
	    if (a != null)
		return a;
	    else if (b != null)
		return b;
	    else
		return null;
	}
	else
	    return get(maxID,n);
    }
    public HeapNode get(int id){
	return get(id, root);
    }

    public int add(HeapNode n){
	if ((double)maxID == (Math.pow(2,height) - 1)){
	    HeapNode temp = root;
	    while (temp.hasLeft())
		temp = temp.getLeft();
	    temp.setLeft(n);
	    height++;
	}
	else{
	    if (current.getParent().hasRight()){
		HeapNode tmp = get(current.getParent().getID()+1);
		tmp.setLeft(n);
		n.setParent(tmp); 
	    }
	    else 
		current.getParent().setRight(n);	    
	    }
	maxID++;
	current = n;
	n.setID(maxID);
	if (n.hasParent()){
	    while(n.getData()>n.getParent().getData())
		n.swap(n.getParent());
	}
	return maxID;
    }

}