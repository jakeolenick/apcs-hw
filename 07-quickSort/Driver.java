import java.io.*;
import java.util.*;


public class Driver{


    public static void main(String[] args){
	quickSort Q = new quickSort();	
	int[] test = {1,5,17,13,5,14,2,8,1,6,5,9,6,9,0,4,3,4,2,4,12};	
	System.out.println(Q.qsort(test));
    }
}