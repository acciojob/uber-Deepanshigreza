package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer CustomerId;
    private String mobile;
    private String password;

    @OneToMany(mappedBy = "customer",cascade =CascadeType.ALL)
    List<TripBooking> tripBookingList=new ArrayList<>();
}