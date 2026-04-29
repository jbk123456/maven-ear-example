package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH107 {

    @EJB
    private HelperBeanG107 helperBeanG107;

    public String identify() {
        return "HelperBeanH107";
    }
}
