
public class TestSearch {
	public void main(String[] args)
	{
		Document d=new Document();
		
		System.out.println("result::"+d.search("Bhavani"));
		WebApplication w=new WebApplication();
		
		System.out.println("result::"+w.search("Bhavani"));
	}
	}


