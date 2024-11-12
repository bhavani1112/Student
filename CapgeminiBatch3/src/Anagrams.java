import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="BHAVANI";
		String b="AABNIHV";
	    char[] m=a.toCharArray();
	    char[] n=b.toCharArray();
	    Arrays.sort(m);
	    Arrays.sort(n);
	    Boolean result=Arrays.equals(m, n);
	    if(result == true)
	    {
	    	System.out.println("Strings are Anagram");
	    }
	    else
	    {
	    	System.out.println("Strings are Not Anagram");
	    }
	    

	}

}
