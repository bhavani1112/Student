
public class TestBankAccount {
	public static void main(String args[])
	{
		BankAccount b=new BankAccount();
		b.setAccountno(435265846l);
		b.setBalance(56000l);
		long account=b.getAccountno();
		System.out.println(account);
		long amount=b.getBalance();
		System.out.println(amount);
	}

}
