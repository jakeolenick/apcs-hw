import java.io.*;
import java.util.*;

public class Calculator{

    private Stack st;
    private Scanner sc;

    public Calculator(){
	st = new Stack();
	sc = new Scanner(System.in);	

	while (true){
	    String s = sc.next();
	    if (s.equals("+")){
		double result = st.pop()+st.pop();
		System.out.println(result);
		st.push(result);
	    }
	    else if (s.equals("-")){
		double result = st.pop()-st.pop();
		System.out.println(result);
		st.push(result);
	    }
	    else if (s.equals("/")){
		double result = st.pop()/st.pop();
		System.out.println(result);
		st.push(result);
	    }
	    else if (s.equals("*")){
		double result = st.pop()*st.pop();
		System.out.println(result);
		st.push(result);
	    }
	    else{
		try{
		    st.push(Double.parseDouble(s));
		    System.out.println(st.peek());
		}
		catch(Exception e){
		    System.out.println(e);
		}//if input is not convertible to double
	    }
	}
    }
	
    public static void main(String[] args){
	
	Calculator C = new Calculator();
    }
    
}
	