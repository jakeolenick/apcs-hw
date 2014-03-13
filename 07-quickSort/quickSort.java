import java.io.*;
import java.util.*;

public class quickSort{

    public Integer[] qsort(Integer[] L){
	if (L.length <= 1){
	    return L;
	}
	Random r = new Random();
	int pivot = r.nextInt(L.length-1);
	ArrayList<Integer> first = new ArrayList<Integer>();
	ArrayList<Integer> second = new ArrayList<Integer>();
	for (int i = 0; i < L.length; i++){
	    if (i == pivot){
		i++;
	    }
	    if (L[i] <= L[pivot]){
		first.add(L[i]);
	    }
	    else {
		second.add(L[i]);
	    }
	}
	Integer[] result = new Integer[L.length];
	Integer[] lower = first.toArray(new Integer[]{});
	lower = qsort(lower);
	Integer[] upper = second.toArray(new Integer[]{});
	upper = qsort(upper);
	for (int i = 0; i < L.length; i++){
	    if (i < lower.length){
		result[i] = lower[i];
	    }
	    else if (i > lower.length){
		result[i] = upper[i-lower.length-1];
	    }
	    else{
		result[i] = L[pivot];
	    }
	}
	return result;
    }
    

}