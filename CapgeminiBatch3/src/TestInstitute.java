
public class TestInstitute extends Institute {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInstitute t= new TestInstitute();
		t.pincode();
		t.InstituteName();
		t.status();
	}
 
	@Override
	int pincode() {
		System.out.println("pincode:690511");// TODO Auto-generated method stub
		return 0;
	}
 
	@Override
	String InstituteName() {
		System.out.println("institute:CAPGEMINI");// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	boolean status() {
		System.out.println("status:True");// TODO Auto-generated method stub
		return false;
	}
 
}
