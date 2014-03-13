import java.io.*;
import java.util.*;

public class quickSort{

    public int[] qsort(int[] L){
	if (L.length <= 1){
	    return L;
	}
	Random r = new Random();
	int pivot = r.nextInt(L.length);
	ArrayList first = new ArrayList<Integer>();
	ArrayList second = new ArrayList<Integer>();
	for (int i = 0; i < L.length; i++){
	    if (i == pivot){
		i++;
	    }
	    else if (L[i] <= L[pivot]){
		first.add(L[i]);
	    }
	    else {
		second.add(L[i]);
	    }
	}
	int[] result = new int[L.length];
	for (int i = 0; i < L.length; i++){
	    if (i < first.size()){
		result[i] = (int)first.get(i);
	    }
	    else if (i > first.size()){
		result[i] = (int)second.get(i-first.size());
	    }
	    else{
		result[i] = L[pivot];
	    }
	}
	return result;
    }
    

}