package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ136 {

    @EJB
    private HelperBeanI136 helperBeanI136;

    public String identify() {
        return "HelperBeanJ136";
    }
}
