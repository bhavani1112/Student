
public class TestATM {
	public static void main(String[] args)
	{
		ApplyAbstract result=new ApplyAbstract();
		result.transactionId();
		result.withdrawAmount();
		System.out.println("Transaction_id:"+result.transactionId());
		System.out.println("Withdraw_amount:"+result.withdrawAmount());
	}

}
