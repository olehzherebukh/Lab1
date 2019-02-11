package project1;

public class Main {

	public static void main(String[] args) {
		SwimmingPool pool1 = new SwimmingPool();
		SwimmingPool pool2 = new SwimmingPool(3, "Peter", 40, 45);
		SwimmingPool pool3 = new SwimmingPool(5, "Michael", 6000, 50, "Kopernyka str.", 40, "Oleh");
		SwimmingPool pool4 = new SwimmingPool();
		
		System.out.println(pool1.toString());
		System.out.println(pool2.toString());
		System.out.println(pool3.toString());
		SwimmingPool.printStaticNumberOfVisitorsToday​();
		pool4.resetValues(4, "Maria", 3, 24, "Academic str.", 35, "Max");
		System.out.println(pool4);
	}

}
