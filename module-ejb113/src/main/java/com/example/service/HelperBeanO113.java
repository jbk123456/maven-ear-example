package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO113 {

    @EJB
    private HelperBeanN113 helperBeanN113;

    public String identify() {
        return "HelperBeanO113";
    }
}
