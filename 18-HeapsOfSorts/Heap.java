public class Heap extends Tree{

    private int maxID;
    protected HeapNode root,current;
    
    public Heap(HeapNode r){
	root = r;
	current = root;
	if (root.getParent() != null)
	    root.setParent(null);
	height = 1;
    }
    public Heap(){
	root = new HeapNode(100,1);
	current = root;
	height = 1;
    }

    public int getMaxID(){ return maxID; }
    public int getCurrent(){ return current; }
    public int get(int id){
	
    }

    public int add(HeapNode n){
	if (maxID == (Math.exp(2,height) - 1)){
	    // add to the left most node on the bottom level
	}
	else{
	    //add to the right most node on the bottom level
	}
	maxID++;
	n.setID(maxID);
	return maxID;
    }
}