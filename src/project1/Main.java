package project1;

public class Main {

	public static void main(String[] args) {
		SwimmingPool obj1 = new SwimmingPool();
		SwimmingPool obj2 = new SwimmingPool(3, "Peter", 40, 45);
		SwimmingPool obj3 = new SwimmingPool(5, "Michael", 6000, 50, "Kopernyka str.", 40, "Oleh");
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		SwimmingPool.printStaticNumberOfVisitorsToday​();
	}

}
