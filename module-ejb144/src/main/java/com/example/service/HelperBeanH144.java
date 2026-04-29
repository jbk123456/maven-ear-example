package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH144 {

    @EJB
    private HelperBeanG144 helperBeanG144;

    public String identify() {
        return "HelperBeanH144";
    }
}
