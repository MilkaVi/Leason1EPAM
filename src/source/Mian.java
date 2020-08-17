package source;
import static  util.Print.*;
import java.math.BigDecimal;
class Mian{
	static int strToInt( String str ){
	    int i = 0;
	    int num = 0;
	    boolean isNeg = false;
	    //Check for negative sign; if it's there, set the isNeg flag
	    if (str.charAt(0) == '-') {
	        isNeg = true;
	        i = 1;
	    }
	    //Process each character of the string;
	    while( i < str.length()) {
	        num *= 10;
	        num += str.charAt(i++) - '0'; //Minus the ASCII code of '0' to get the value of the charAt(i++).
	    }
	    if (isNeg)
	        num = -num;
	    return num;
	}
	
	public Object problem(Object a, Object b, Object c) {
		if (a instanceof Integer) {
			return ((((Integer) a - 3) * (Integer) b / 2) + (Integer) c);
		} 
		if (a instanceof Double) {
			return ((((Double) a - 3) * (Double) b / 2) + (Double) c);
		} 
		
		if (a instanceof Character) {
			String as = "" + a;
			String bs = "" + b;
			String cs = "" + c;
			int ai = strToInt((String)as);
			int bi = strToInt((String)bs);
			int ci = strToInt((String)cs);			
			int z = (((ai - 3) * bi / 2) + ci);
			String strAsciiTab = Character.toString((char) z);
			return strAsciiTab;
		} 
		if (a instanceof String) {
			int ai = strToInt((String)a);
			int bi = strToInt((String)b);
			int ci = strToInt((String)c);			
			int z = (((ai - 3) * bi / 2) + ci);
			String strAsciiTab = Character.toString((char) z);
			return strAsciiTab;
		} 
		else {
			return 10;
		}
		}
	
	static double problem1(double a, double b, double c) {		
		return (((a - 3) * b / 2) + c);		
	}
	
	static double problem2(double a, double b, double c) {		
		return 	(((b+Math.sqrt((b*b + 4*a*c)))/2*a) - Math.pow(a, 3)*c + Math.pow(b, -2));		
	}
	
	static double problem3(double a, double b, double c) {		
		return 	(((b+Math.sqrt((b*b + 4*a*c)))/2*a)
				- Math.pow(a, 3)*c + Math.pow(b, -2));		
	}
	
	static double problem4(double x, double y) {		
		return ((Math.sin(x) + Math.cos(y))/
				(Math.cos(x) - Math.sin(y)) * Math.tan(x*y));	
	}
	
	static void problem4(double a) {	
		int b = (int)a;
		String str = "" + a;
        String[] arrOfStr = str.split("\\.");
        print(arrOfStr[1]+ "." + b);		
	}
	static String problem5 (int a) {	
		String hours = "";
		String min = "";
		String sec = "";
		if (a/3600 > 0) {
			hours+= a/3600;
			
			min+= (a - strToInt(hours) * 3600)/60; 
			
			sec+=( a - (strToInt(hours)*3600 + strToInt(min)*60));
			
		}else {
			hours+="00";
			if(a/60 > 0) {
				min += a/60;
				sec+= a- strToInt(min)*60;
			}
			else {
				min+="00";
				sec += a;
				}
		}
		StringBuilder ss = new StringBuilder(sec);
		StringBuilder sm = new StringBuilder(min);
		StringBuilder sh = new StringBuilder(hours);
		if (min.length() == 1)
			sm.insert(0, "0");
		if (sec.length() == 1)
			ss.insert(0, "0");
		if (hours.length() == 1)
			sh.insert(0, "0");
		return (sh + ":" + sm + ":" + ss);		
	}
	
	
	
	public static  void main(String...strings) {
		print(problem5(17589));
		
	}
}
