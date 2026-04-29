package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH20 {

    @EJB
    private HelperBeanG20 helperBeanG20;

    public String identify() {
        return "HelperBeanH20";
    }
}
