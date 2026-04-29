package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE63 {

    @EJB
    private HelperBeanD63 helperBeanD63;

    public String identify() {
        return "HelperBeanE63";
    }
}
