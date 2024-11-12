
public class Break {
	public static void main(String[]args)
	{
		int i=3;
		String level=" ";
		switch(i)
		{
		case 1:level="1.Beginner";
		       System.out.println("Bigenner");
		       break;
		case 2:level="2.Intermediate";
	       System.out.println("Intermediate");
	       break;
		case 3:level="3.Expert";
	       System.out.println("Expert");
	       break;
	      default:
	    	  System.out.println("no Execution");
		}
	}

}
