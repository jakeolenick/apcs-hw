public class Driver{

    public static void main(String[] args){
	MyLinkedList m = new MyLinkedList();
       
	m.add("A");
	m.add("B");
	m.add(3);
	m.add(2,10);
	System.out.println(m.remove(2));
	System.out.println(m);
	
	
    }
}