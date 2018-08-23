package compo;

public class Vechicle {
	String name;
	int wheel,year;
	String colour;
	public void bikefeatures()                                //print the bike features details
	{
		System.out.println("the bike model name is:\t" +name);
		System.out.println("the colour of the bike is:\t" +colour);
		System.out.println("the bike invented year is:\t" + year);
		System.out.println("the wheel is:" +wheel);
	}
	public void setname(String n)                          //using get set method to set the bike details
	{
	name=n;	
	}
	public void setcolour(String c)
	{
		colour=c;
		
	}
	public void setwheel(int w)
	{
		wheel=w;
	}
	public void setyear(int y)
	{
		year=y;
	}

}
