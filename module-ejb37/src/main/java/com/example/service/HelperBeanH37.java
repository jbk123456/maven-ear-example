package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH37 {

    @EJB
    private HelperBeanG37 helperBeanG37;

    public String identify() {
        return "HelperBeanH37";
    }
}
