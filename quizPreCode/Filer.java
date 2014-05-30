import java.io.*;
import java.util.*;


public class Filer{

    private Scanner sc;
    private File from,to;
    private FileWriter fw;
    private BufferedWriter bw;
    

    /*Basically what this does:
Write(String s) writes using a bufferedWriter. Every time a bw is made to a file, the 
file is apparently erased and the writing begins again from the beginning of the file.
Scanner is a scanner which is nice and simple.

    **/


    public static void main(String[] args){
	File practiceA = new File("testTo.txt");
	File practiceB = new File("testFrom.txt");
	Filer f = new Filer(practiceA, practiceB);

	System.out.println(f.printTo());
	System.out.println(f.printFrom());
	f.write("word");
	f.write(" word2");
	f.write(" word3");
	System.out.println(f.printTo());		
	System.out.println(f.readLine());
	System.out.println(f.readLine());
    }

    public Filer(File thither, File thence){//these are filenames for to and from
	to = thither;
	from = thence;
	sc = makeScanner(from);
	try{
	    fw = new FileWriter(to.getAbsoluteFile());
	    bw = new BufferedWriter(fw);
	}
	catch(IOException e){System.out.println(e);}
    }
    public Filer(String thither, String thence){//these are filenames for to and from
	to = new File(getCurrentPath() + "/" + thither);
	from = new File(getCurrentPath() + "/" + thence);
	sc = makeScanner(from);
	try{
	    fw = new FileWriter(to.getAbsoluteFile());
	    bw = new BufferedWriter(fw);
	}
	catch(IOException e){System.out.println(e);}
    }

    //CONVENIENT METHODS

    public static File makeFileHere(String filename){
	String pathToHere = System.getProperty("user.dir");
	File f = new File(pathToHere + "/" + filename);
	try {
	    f.createNewFile();
	}
	catch(IOException e){}
	return f;
    }
    public static String getCurrentPath(){
	return System.getProperty("user.dir");
    }
    private Scanner makeScanner(File f){
	Scanner scan;
	try{
	    scan = new Scanner(f);
	}
	catch(FileNotFoundException e){
	    System.out.println(e + "\n" + "type in a proper file pathname please\n");
	    scan = new Scanner(System.in);
	    String s = scan.next();
	    scan = makeScanner(new File(s));
	}
	return scan;
    }

    //ACCESSORS

    public File getFrom(){
	return from;
    }
    public File getTo(){
	return to;
    }
    public void setFrom(File f){
	from = f;
    }
    public void setTo(File f){
	to = f;
	sc = makeScanner(to);
    }
    public String printFrom(){
	String result = "";
	Scanner tmp = makeScanner(from);
	while (tmp.hasNext())
	    result += tmp.nextLine() + "\n";
	return result;
    }
    public String printTo(){
	String result = "";
	Scanner tmp = makeScanner(to);
	while (tmp.hasNext())
	    result += tmp.nextLine() + "\n";
	return result;
    }

    //READ, WRITE

    public String readLine(File f, int line){
	Scanner scan = makeScanner(f);
	for(int i = 0; i < line; i++){
	    scan.nextLine();
	}
	return scan.nextLine();
    }
    public String readLine(){ return sc.nextLine(); }
    public String read(){ return sc.next(); }//reads til whitespace


    public void write(String s){
	try {	   
	    bw.write(s);
	    bw.flush();
	} 
	catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
