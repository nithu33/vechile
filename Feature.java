import compo.*;
public class Feature extends Vechicle {
	public void setquality()
	{
	Types obj=new Types();   //creating object for inherited class
	obj.quality();
	}
	public void setsecure()   
	{
	Types obj1=new Types();      //creating object from the types class
	obj1.secure();
	}
	public void setstart()
	{
	Types obj2=new Types();
	obj2.start();
	}
	public void setstop()
	{
		Types obj3=new Types();
			obj3.stop();
				
	}
	
}
