package project1;

public class SwimmingPool {
	public String Address;
	public int Volume;
	public int MaxAmoutOfVisitors;
	
	private int Depth;
	private String NameOfCoach;
	 
	public static int NumberOfVisitorsToday = 28;
	
	protected int Width;
	protected String NameOfVisitor;
	
	
	public int getDepth() {
        return this.Depth;
    }
    public void setDepth(int depth) {
        this.Depth = depth;
    }
 
 
    public String getNameOfCoach() {
        return this.NameOfCoach;
    }
    public void setNameOfCoach(String nameOfCoach) {
        this.NameOfCoach = nameOfCoach ;
    }
    
    
    public SwimmingPool() {
    	
    }
    
    public SwimmingPool(int dep, String name, int vol, int amountOfVis) {
    	this.Depth = dep;
    	this.NameOfCoach = name;
    	this.Volume = vol;
    	this.MaxAmoutOfVisitors = amountOfVis;
    }
    
    public SwimmingPool(int dep, String name, int vol, int amountOfVis, String adr, int wid, String nameOfVis) {
    	this (dep, name, vol, amountOfVis);
    	this.Address = adr;
    	this.Width = wid;
    	this.NameOfVisitor = nameOfVis;
    }
    
    public String toString() {
    	String GeneralInfo = "\t" + "General Info about Swimming Pool" + "\t" + "\n";
    	GeneralInfo = GeneralInfo + "Address:" + Address + "\n";
    	GeneralInfo = GeneralInfo + "Volume:" + Volume + "\n";
    	GeneralInfo = GeneralInfo + "Max amout of visitors:" + MaxAmoutOfVisitors + "\n";
    	GeneralInfo = GeneralInfo + "Depth:" + Depth + "\n";
    	GeneralInfo = GeneralInfo + "Name of coach:" + NameOfCoach + "\n";
    	GeneralInfo = GeneralInfo + "Width:" + Width + "\n";
    	GeneralInfo = GeneralInfo + "Name of visitor:" + NameOfVisitor + "\n";
    	return GeneralInfo;
    }
    
    public static void printStaticNumberOfVisitorsToday​() {
    	System.out.println(NumberOfVisitorsToday);
    }
    
    public void printNumberOfVisitorsToday​() {
    	System.out.println(NumberOfVisitorsToday);
    }
    
    public void resetValues(int dep, String name, int vol, int amountOfVis, String adr, int wid, String nameOfVis) {
    	this.Depth = dep;
    	this.NameOfCoach = name;
    	this.Volume = vol;
    	this.MaxAmoutOfVisitors = amountOfVis;
    	this.Address = adr;
    	this.Width = wid;
    	this.NameOfVisitor = nameOfVis;
    }
}
