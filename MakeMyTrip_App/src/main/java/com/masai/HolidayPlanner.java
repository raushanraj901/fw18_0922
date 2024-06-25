package com.masai;

import java.util.Map;

public class HolidayPlanner {
    private Map<Hotel, Package> theMap;

    // Setter for theMap for setter injection
    public void setTheMap(Map<Hotel, Package> theMap) {
        this.theMap = theMap;
    }

    // Initialization method
    public void initialize() {
        System.out.println("inside initialize method");
    }

    // Termination method
    public void terminate() {
        System.out.println("inside terminate method");
    }

    // Display details method
    public void displayDetails() {
        System.out.println("inside displayDetails of HolidayPlanner class");
        // Iterate through theMap and print details hotel-wise
        for (Map.Entry<Hotel, Package> entry : theMap.entrySet()) {
            Hotel hotel = entry.getKey();
            Package pkg = entry.getValue();
            System.out.println("Hotel Details: " + hotel);
            System.out.println("Package Details: " + pkg);
            System.out.println("--------------------------");
        }
    }
}
