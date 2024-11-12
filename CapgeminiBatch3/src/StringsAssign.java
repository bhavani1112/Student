
public class StringsAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String String1="Capgemini v & V Automation Selenium Java Training";
       if(String1.contains("Selenium Java"))
       {
    	   System.out.println("true");
       }
       else
       {
    	   System.out.println("false");
       }
       System.out.println("-------------------");
       String String2="Pune Bengaluru Chennai";
       String output=String2.substring(5, 14);
       System.out.println(output);
       System.out.println("-------------------");
       String String3="Selenium Java";
       String String4=" Bengaluru";
       String result=String3.concat(String4);
       System.out.println(result);
       System.out.println("-------------------");
       /*String String5="123 Java 789";
       System.out.println("-------------------");*/
       char res=String3.charAt(0);
       System.out.println(res);
       System.out.println("-------------------");
       
       
	}

}
