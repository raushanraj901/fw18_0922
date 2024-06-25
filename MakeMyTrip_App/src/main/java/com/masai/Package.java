package com.masai;

public class Package {
	 private int packageId;
	    private String packageName;
	    private int duration;
	    private double price;

	    // Constructor with fields for constructor injection
	    public Package(int packageId, String packageName, int duration, double price) {
	        this.packageId = packageId;
	        this.packageName = packageName;
	        this.duration = duration;
	        this.price = price;
	    }

	    // Override toString method to display all fields
	    @Override
	    public String toString() {
	        return "Package{" +
	                "packageId=" + packageId +
	                ", packageName='" + packageName + '\'' +
	                ", duration=" + duration +
	                ", price=" + price +
	                '}';
	    }
}
