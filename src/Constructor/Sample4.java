package Constructor;

public class Sample4 
{
	int num3;   //50
	int num4;   //30
	
	//user defined constructor --> provided by user
	//use1: initialize global variable
	//use2:  copy all the members of class into object
	Sample4()
	{
		num3=50;
		num4=30;
	}
	
	
	public void sub()
	{
		System.out.println(num3-num4);
	}

}
