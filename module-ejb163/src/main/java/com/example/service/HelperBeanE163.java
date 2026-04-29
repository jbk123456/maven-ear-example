package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE163 {

    @EJB
    private HelperBeanD163 helperBeanD163;

    public String identify() {
        return "HelperBeanE163";
    }
}
