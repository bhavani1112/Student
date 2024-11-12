
 class Definition {
	
		int convert;
		int max;
		public Definition()
		{
			 
		}
}
	class StringMethods
	{
		public int convertToInt(Definition sp,String str)
		{
			int x=Integer.parseInt(str);
			sp.convert=x;
			return x;
		}
		public int getMax(Definition sp,String str,char ch)
		{
		  char s[]=str.toCharArray();
		  int count=0;
		  for(int i=0;i<s.length;i++)
		  {
			  if(s[i]==ch)
			  {
				  count=count+1;
			  }
		  }
		  sp.max=count;
		  return count;
		  
	
			
		}
	}

class Definitiond
{
public static void main(String args[]) {
		// TODO Auto-generated method stub
		Definition sp=new Definition();
		StringMethods sm=new StringMethods();
		System.out.println(sm.getMax(sp,"fgfgfgf",'g'));
		System.out.println(sm.convertToInt(sp, "123"));
		
		
		

	}
}

