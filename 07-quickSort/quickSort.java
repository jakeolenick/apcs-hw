import java.io.*;
import java.util.*;

public class quickSort{

    public int partition(int[] a, int l, int r) {
	Random rand = new Random();
	int n;
	int pivInd = l+rand.nextInt(r-l);
	int pivot = a[pivInd];
	n = a[r];
	a[r] = a[pivInd];
	a[pivInd]=n;

	int wall=l;
	for (int i=l;i<r;i++) {
	    if (a[i]<pivot) {
		n = a[i];
		a[i]=a[wall];
		a[wall]=n;
		wall++;
	    }
	}
	n = a[wall];
	a[wall]=a[r];
	a[r]=n;
	return wall;
    }


    public void qsort2(int[] a, int l, int r){
	if (r <= 2){
	    return;
	}
	else{
	    int p = partition(a,l,r);
	    if (p-1>l)
		qsort(a,l,p-1);
	    if (p+1<r)
		qsort(a,p+1,r);

	}


    public Integer[] qsort1(Integer[] L){
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