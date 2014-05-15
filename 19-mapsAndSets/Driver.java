import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){

	TreeMap<Integer,Double> tm = new TreeMap<Integer,Double>();

	tm.put(1,1.0);
	tm.put(2,2.25);
	tm.put(3,6.0);
	tm.put(4,1.0);
	tm.put(5,1.0);
	System.out.println(tm);
	
	randomTreeMapInsert(tm,30,100);
	
	System.out.println(tm);
    }

    public static void randomTreeMapInsert(TreeMap<Integer,Double> tmp, int num, int range){
	for(int i = 1; i <= num; i++){
	    tmp.put(i,Math.random() * range);
	}
    }

    

}