package ua.lviv.iot.lab1;

public class SwimmingPool {
	public final static int numberOfVisitorsToday = 28;
	
	protected int width;
	protected String nameOfVisitor; 
	
	private String address;
	private int volume;
	private int maxAmoutOfVisitors;
	private int depth;
	private String nameOfCoach;
	 
public SwimmingPool() {
    	
    }
    
    public SwimmingPool(int depth, String nameOfCoach,
    		int volume, int amountOfVisitor) {
    	this.depth = depth;
    	this.nameOfCoach = nameOfCoach;
    	this.volume = volume;
    	this.maxAmoutOfVisitors = amountOfVisitor;
    }
    
    public SwimmingPool(int depth, String nameOfCoach,
    		int volume, int amountOfVisitor,
    		String address, int width,
    		String nameOfVisitor) {
    	this (depth, nameOfCoach, volume, amountOfVisitor);
    	this.address = address;
    	this.width = width;
    	this.nameOfVisitor = nameOfVisitor;
    }
    
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
    
    public String toString() {
    	String GeneralInfo = "\t" + "General Info about Swimming Pool" + "\n";
    	GeneralInfo += "Address:" + address + "\n";
    	GeneralInfo += "Volume:" + volume + "\n";
    	GeneralInfo += "Max amout of visitors:" + maxAmoutOfVisitors + "\n";
    	GeneralInfo += "Depth:" + depth + "\n";
    	GeneralInfo += "Name of coach:" + nameOfCoach + "\n";
    	GeneralInfo += "Width:" + width + "\n";
    	GeneralInfo += "Name of visitor:" + nameOfVisitor + "\n";
    	return GeneralInfo;
    }
    
    public static void printStaticNumberOfVisitorsToday​() {
    	System.out.println("Number Of Visitors Today:" + numberOfVisitorsToday + "\n");
    }
    
    public void printNumberOfVisitorsToday​() {
    	System.out.println("Number Of Visitors Today:" + numberOfVisitorsToday + "\n");
    }
    
    public void resetValues(int depth, String name,
    		int volume, int maxAmountOfVisitor,
    		String address, int width,
    		String nameOfVisitor) {
    	this.depth = depth;
    	this.nameOfCoach = name;
    	this.volume = volume;
    	this.maxAmoutOfVisitors = maxAmountOfVisitor;
    	this.address = address;
    	this.width = width;
    	this.nameOfVisitor = nameOfVisitor;
    	return;
    }
}
