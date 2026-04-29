package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH23 {

    @EJB
    private HelperBeanG23 helperBeanG23;

    public String identify() {
        return "HelperBeanH23";
    }
}
