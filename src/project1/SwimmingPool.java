package project1;

public class SwimmingPool {
	protected int width;
	protected String nameOfVisitor;
	
	private String address;
	private int volume;
	private int maxAmoutOfVisitors;
	private int depth;
	private String nameOfCoach;
	 
	public static int NumberOfVisitorsToday = 28;
	
	
	public String getAddress() {
        return this.address;
    }
	
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getVolume() {
        return this.volume;
    }
	
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public int getMaxAmoutOfVisitors() {
        return this.maxAmoutOfVisitors;
    }
	
    public void setMaxAmoutOfVisitors(int maxAmoutOfVisitors) {
        this.maxAmoutOfVisitors = maxAmoutOfVisitors;
    }
	
	public int getDepth() {
        return this.depth;
    }
	
    public void setDepth(int depth) {
        this.depth = depth;
    }
 
    public String getNameOfCoach() {
        return this.nameOfCoach;
    }
    
    public void setNameOfCoach(String nameOfCoach) {
        this.nameOfCoach = nameOfCoach ;
    }
    
    
    public SwimmingPool() {
    	
    }
    
    public SwimmingPool(int dep, String name,
    		int vol, int amountOfVis) {
    	this.depth = dep;
    	this.nameOfCoach = name;
    	this.volume = vol;
    	this.maxAmoutOfVisitors = amountOfVis;
    }
    
    public SwimmingPool(int dep, String name,
    		int vol, int amountOfVis,
    		String adr, int wid,
    		String nameOfVis) {
    	this (dep, name, vol, amountOfVis);
    	this.address = adr;
    	this.width = wid;
    	this.nameOfVisitor = nameOfVis;
    }
    
    public String toString() {
    	String GeneralInfo = "\t" + "General Info about Swimming Pool" + "\t" + "\n";
    	GeneralInfo = GeneralInfo + "Address:" + address + "\n";
    	GeneralInfo = GeneralInfo + "Volume:" + volume + "\n";
    	GeneralInfo = GeneralInfo + "Max amout of visitors:" + maxAmoutOfVisitors + "\n";
    	GeneralInfo = GeneralInfo + "Depth:" + depth + "\n";
    	GeneralInfo = GeneralInfo + "Name of coach:" + nameOfCoach + "\n";
    	GeneralInfo = GeneralInfo + "Width:" + width + "\n";
    	GeneralInfo = GeneralInfo + "Name of visitor:" + nameOfVisitor + "\n";
    	return GeneralInfo;
    }
    
    public static void printStaticNumberOfVisitorsToday​() {
    	System.out.println("Number Of Visitors Today:" +NumberOfVisitorsToday + "\n");
    }
    
    public void printNumberOfVisitorsToday​() {
    	System.out.println("Number Of Visitors Today:" +NumberOfVisitorsToday + "\n");
    }
    
    public void resetValues(int dep, String name,
    		int vol, int amountOfVis,
    		String adr, int wid,
    		String nameOfVis) {
    	this.depth = dep;
    	this.nameOfCoach = name;
    	this.volume = vol;
    	this.maxAmoutOfVisitors = amountOfVis;
    	this.address = adr;
    	this.width = wid;
    	this.nameOfVisitor = nameOfVis;
    	return;
    }
}
