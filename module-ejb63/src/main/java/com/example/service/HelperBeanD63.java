package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD63 {

    @EJB
    private HelperBeanC63 helperBeanC63;

    public String identify() {
        return "HelperBeanD63";
    }
}
