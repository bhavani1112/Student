import java.util.Scanner;
 
public class Shape {
int length;
int width;
Scanner sc= new Scanner(System.in);
  public void getArea()
  {
	  System.out.println("enter length");
	  length=sc.nextInt();
	  System.out.println("enter width");
	  width= sc.nextInt();
	  System.out.println("Area:"+length*width);
}
}