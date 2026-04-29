package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI136 {

    @EJB
    private HelperBeanH136 helperBeanH136;

    public String identify() {
        return "HelperBeanI136";
    }
}
