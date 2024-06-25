package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MakeMyTripApp {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MakeMyTripApp.class, args);
        HolidayPlanner planner = context.getBean(HolidayPlanner.class);
        planner.displayDetails();
        context.close();
    }

}
