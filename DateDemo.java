import java.util.Date;




public class DateDemo extends Thread
{
	public static void main(String[] args) 
	{
		Date date=new Date();
		System.out.println(date);
		long msec=date.getTime();
		System.out.println(msec);

		
	}



}
