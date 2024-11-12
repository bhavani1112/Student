
public class Duck {
	private int size=12;
	public void setSize(int x)
	{
		if(x<=0);
		elseif(x>=25);
		else
			size=x;
	}
	public int getSize()
	{
		return size;
	}
	public void display()
	{
		if(size>10)
			System.out.println("bigger duck!!");
		else if(size<10)
			System.out.println("Smaller duck!!");
	}

}
