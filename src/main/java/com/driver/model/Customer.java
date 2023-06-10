package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int customerId;
    String mobile;
    String password;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<TripBooking> tripBookingList= new ArrayList<>();
}