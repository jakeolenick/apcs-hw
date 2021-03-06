public class Node{

    private Object data;
    private Node next;

    public Node(Object s){
	data = s;
    }
    public Node(Object s, Node next){
	data = s;
	this.next = next;
    }

    public void setNext(Node n){
	next = n;
    }
    public void setData(String s){
	data = s;
    }

    public Object getData(){
	return data;
    }
    public Node getNext(){
	return next;
    }
    
    public String toString(){
	return data.toString();
    }

}