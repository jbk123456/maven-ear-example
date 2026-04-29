package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH61 {

    @EJB
    private HelperBeanG61 helperBeanG61;

    public String identify() {
        return "HelperBeanH61";
    }
}
