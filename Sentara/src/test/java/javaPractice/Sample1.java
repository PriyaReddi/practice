package javaPractice;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		/*Sample1 s=new Sample1();
		System.out.println(s);*/
		String s="priya";
		
		char[] c=s.toCharArray();
		int count=0;
		for (char d : c) 
		{
			count++;
			System.out.println(d);
			
		}
		System.out.println(count);
	}

}
