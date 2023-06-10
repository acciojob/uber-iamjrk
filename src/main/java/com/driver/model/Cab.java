package com.driver.model;

import javax.persistence.*;
import java.sql.Driver;

@Entity
public class Cab
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int Id;
    int perKmRate;
    boolean availability;

    @OneToOne(mappedBy = "cab",cascade = CascadeType.ALL)
    Driver driver;

    public Cab(int id, int perKmRate, boolean availability, Driver driver) {
        Id = id;
        this.perKmRate = perKmRate;
        this.availability = availability;
        this.driver = driver;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}