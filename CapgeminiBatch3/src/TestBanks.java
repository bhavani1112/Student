
public class TestBanks {
	public static void main(String[] args)
	{
		Axis a=new Axis();
		String rate_Interest=a.rateOfInterest();
		System.out.println("Axis bank Rate of Interest::"+rate_Interest);
		System.out.println("--------------------------------");
		HDFC h=new HDFC();
		String rate_Interest_hdfc=h.rateOfInterest();
		System.out.println("hdfc bank Rate of Interest::"+rate_Interest_hdfc);
		System.out.println("--------------------------------");
		
	}

}
