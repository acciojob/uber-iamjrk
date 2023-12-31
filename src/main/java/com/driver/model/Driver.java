package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Driver
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String mobile;
    String password;

    @OneToOne
    @JoinColumn
    Cab cab;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    List<TripBooking> tripBookingList= new ArrayList<>();

    public Driver(int id, String mobile, String password, Cab cab, List<TripBooking> tripBookingList) {
        this.id = id;
        this.mobile = mobile;
        this.password = password;
        this.cab = cab;
        this.tripBookingList = tripBookingList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}