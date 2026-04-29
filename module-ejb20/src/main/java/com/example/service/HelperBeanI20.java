package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI20 {

    @EJB
    private HelperBeanH20 helperBeanH20;

    public String identify() {
        return "HelperBeanI20";
    }
}
