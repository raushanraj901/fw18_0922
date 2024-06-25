package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    // Define DataSource bean
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db1");
        dataSource.setUsername("root");
        dataSource.setPassword("Mzakir@313");
        return dataSource;
    }

    // Define hotel beans
    @Bean
    public Hotel sheraton() {
        return new Hotel(1, "Sheraton", "New York", 5);
    }

    @Bean
    public Hotel hilton() {
        return new Hotel(2, "Hilton", "Chicago", 4);
    }

    @Bean
    public Hotel marriott() {
        return new Hotel(3, "Marriott", "San Francisco", 4);
    }

    // Define package beans
    @Bean
    public Package package1() {
        return new Package(101, "Weekend Escape", 2, 350.0);
    }

    @Bean
    public Package package2() {
        return new Package(102, "City Explorer", 3, 500.0);
    }

    @Bean
    public Package package3() {
        return new Package(103, "Beach Paradise", 5, 800.0);
    }

    // Define HolidayPlanner bean with lazy initialization and singleton scope
    @Bean(initMethod = "initialize", destroyMethod = "terminate")
    public HolidayPlanner holidayPlanner() {
        HolidayPlanner planner = new HolidayPlanner();
        Map<Hotel, Package> theMap = new HashMap<>();
        theMap.put(sheraton(), package1());
        theMap.put(hilton(), package2());
        theMap.put(marriott(), package3());
        planner.setTheMap(theMap);
        return planner;
    }
}
