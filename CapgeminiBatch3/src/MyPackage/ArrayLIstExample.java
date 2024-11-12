package MyPackage;


public class ArrayLIstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers=new ArrayList<>(List.of(10,20,30,40,50));
		//Access and print elements form ArrayList
		System.out.println("element at index 0:"numners.get(0));
		System.out.println("element at index 2:"numners.get(2));
		System.out.println("element at index 4:"numners.get(4));
		//Calculate and print the sum of all elemets in the ArrayList
		int sum=numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of ArrayLIst elements:"+sum);
		//update an element in the ArrayList
		numbers.set(2,35);
		System.out.println("Updated element at index 2:"+numbers(2));
		//Iterate through the ArrayList using a for each loop and print the elements
		System.out.println("Elements in the ArrayList:");
		for(int number:numbers)
		{
			System.out.println(number);
		}

	}

}
