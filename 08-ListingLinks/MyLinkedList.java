public class MyLinkedList{

    private Node head;
    private Node dummy;

    public MyLinkedList(){
	head = null;
	dummy = new Node(null);
	dummy.setNext(head);
    }

    public void add(Object s){
	Node tmp = new Node(s);
	tmp.setNext(head);
	head = tmp;
    }

    public void add(int i, Object s){
	Node tmp = head;
	for(int j = 0; j<i; j++){
	    tmp = tmp.getNext();
	}
	Node tmp2 = tmp;
	tmp = new Node(s);
	tmp.setNext(tmp2.getNext());
	tmp2.setNext(tmp);
    }

    public Node remove(int i){
	Node pretmp = head;
	for(int j=0; j<i-1; j++){
	    pretmp=pretmp.getNext();
	}
	Node tmp = pretmp.getNext();
	pretmp.setNext(tmp.getNext());
	return tmp;	
    }

    public String get(int i){
	Node tmp = head;
	for(int j = 0; j<i; j++){
	    tmp = tmp.getNext();
	}
	return tmp.toString();
    }

    public Node set(int i, Object s){
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

    public int find (Object s){
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
    
    public int length(){
	Node tmp = head;
	boolean inList = true;
	int count = 0;
	while (inList){
	    if (tmp != null){
		count++;
	    }
	    else {
		inList = false;
	    }
	}
	return count;
    }
           
}
