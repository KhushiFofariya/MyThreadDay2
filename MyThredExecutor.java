
public class MyThredExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread a1 = new MyThread();
		System.out.println("Before runalbr stage Thread is aliev or not?"+a1.isAlive());
		a1.start();
		
		try
		{
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			System.out.println("Thread is Interrupted");
		}
		System.out.println("After Complete execution of Thread Thread is aliev or not?"+a1.isAlive());
	}

}
