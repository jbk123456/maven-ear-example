package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG20 {

    @EJB
    private HelperBeanF20 helperBeanF20;

    public String identify() {
        return "HelperBeanG20";
    }
}
