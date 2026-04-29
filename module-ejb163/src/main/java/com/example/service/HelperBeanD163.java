package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD163 {

    @EJB
    private HelperBeanC163 helperBeanC163;

    public String identify() {
        return "HelperBeanD163";
    }
}
