public class MyLinkedList<E>{

    private Node head, dummy, tail;
    private int length;

    public MyLinkedList(){
	dummy = new Node(null);
	head = dummy;
	tail = dummy;
    }

    public void add(E s){//add to end
	Node tmp = new Node(s);
	tail.setNext(tmp)
	tail = tmp;
	length++;
    }

    public void add(int i, E s){
	Node tmp = head;
	for(int j = 0; j<i; j++){
	    tmp = tmp.getNext();
	}
	Node tmp2 = tmp;
	tmp = new Node(s);
	tmp.setNext(tmp2.getNext());
	tmp2.setNext(tmp);
	if (i==length-1)

	    tail=tmp;
	length++
    }

    public Node remove(int i){
	Node pretmp = head;
	for(int j=0; j<i-1; j++){
	    pretmp=pretmp.getNext();
	}
	Node tmp = pretmp.getNext();
	pretmp.setNext(tmp.getNext());
	return tmp;
	if (i==length-1)
	    tail=pretmp;
	length--;
    }

    public String get(int i){
	Node tmp = head;
	for(int j = 0; j<i; j++){
	    tmp = tmp.getNext();
	}
	return tmp.toString();
    }

    public Node set(int i, E s){
	Node tmp = head;
	Node pretmp = head;
	for(int j = 0; j<i-1; j++){
	    pretmp = pretmp.getNext();
	}
	tmp = pretmp.getNext();
	Node tmp2 = tmp;
	tmp = new Node(s);
	tmp.setNext(tmp2.getNext());
	pretmp.setNext(tmp);
	return tmp2;
    }

    public String toString(){
	String result = "[ ";
	Boolean inList = true;
	Node tmp = head;
	while (inList){
	    if (tmp != null){
		result = result + "" + tmp + " ";
		tmp = tmp.getNext();
	    }
	    else{
		inList = false;
	    }
	}
	return result + "]";
    }

    public int find (E s){
	Node tmp = head;
	boolean inList = true;
	int count = 0;
	while(inList){
	    if (tmp != null){
		if (tmp.getData().equals(s)){
		    return count;
		}
		tmp = tmp.getNext();
		count ++;
	    }
	    else{
		return -1;
	    }
	}	
    }
    
    public int size(){
	return length;
    }

    public MyLLIterator<E> iterator(){
	return new MyLLIterator<E>(this);
    }
           
}
