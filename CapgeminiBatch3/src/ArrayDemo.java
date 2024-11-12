
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number=new int[3];
		number[0]=32;
		number[1]=76;
		number[2]=22;
		System.out.println("1st Index value:"+number[0]);
		System.out.println("2nd Index value:"+number[1]);
		System.out.println("3rd Index value:"+number[2]);
		System.out.println("-------------------------------");
		number[1]=50;
		for(int numbers:number) {
			System.out.println(numbers);
		}
	}

}
