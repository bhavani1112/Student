
public class TestBank {
	public static void main(String[] args)
	{
	   PrivateBanks g=new GetAllBanks();
	   System.out.println("public Bank::"+g.getPrivateBankName());
	   System.out.println("------------------------------------");
	   PublicBanks p=new GetAllBanks();
	   System.out.println("private Bank::"+p.getPublicBankName());
	}

}
