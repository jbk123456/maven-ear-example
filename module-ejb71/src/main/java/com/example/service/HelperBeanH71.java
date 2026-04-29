package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH71 {

    @EJB
    private HelperBeanG71 helperBeanG71;

    public String identify() {
        return "HelperBeanH71";
    }
}
