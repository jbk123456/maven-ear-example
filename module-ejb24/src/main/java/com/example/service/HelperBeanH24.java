package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH24 {

    @EJB
    private HelperBeanG24 helperBeanG24;

    public String identify() {
        return "HelperBeanH24";
    }
}
