package day25;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {

	public static void main(String[] args) {
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("MMMMMMMMM yyyy");  
	    String strDate= formatter.format(date);  
	    System.out.println(strDate);  
	    
	    
	    formatter = new SimpleDateFormat("d");  
	    String d= formatter.format(date);  
	    
	    System.out.println(d);
	}

}
