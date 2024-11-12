
public class StateCountry {
	public static void main(String[] args)
	{
		Country c=new DisplayStateCountry();
		System.out.println("country::"+c.getCountryName("India"));
		State s=new DisplayStateCountry();
		System.out.println("State::"+s.getStateName("Telangana"));
	}

}