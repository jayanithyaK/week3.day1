package week3.day1;

public class Students {
	
	public void getStdtInfo(int id)
	{
		
		System.out.println(id);
	}
	
	public void getStdtInfo(int id,String name)
	{
		
		System.out.println( id + name);
	}
	
	public void getStdtInfo(String email, long phonenum)
	{
		
		System.out.println(email +  phonenum);
	}
	
	public static void main(String[] args) {
		Students info = new Students();
		info.getStdtInfo(1001);
		info.getStdtInfo(1001, "Jayanithya");
		info.getStdtInfo("nithya@gmail.com",741805056);
	}

	}
