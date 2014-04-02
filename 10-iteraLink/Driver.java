public class Driver{

    public static void main(String[] args){
	MyLinkedList<Object> m = new MyLinkedList<Object>();
	MyLLIterator<Object> it = m.iterator();

	m.add("A");
	m.add("B");
	m.add(3);
	m.add(2,10);
	System.out.println(m);
	System.out.println(m.remove(2));
	System.out.println(m.length());
	
	
    }
}
