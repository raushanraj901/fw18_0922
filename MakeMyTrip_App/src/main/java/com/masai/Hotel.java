package com.masai;

public class Hotel {
	
	private int hotelId;
    private String hotelName;
    private String location;
    private int rating;

    // Constructor with fields for constructor injection
    public Hotel(int hotelId, String hotelName, String location, int rating) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.location = location;
        this.rating = rating;
    }

    // Override toString method to display all fields
    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", location='" + location + '\'' +
                ", rating=" + rating +
                '}';
    }

}
