package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG24 {

    @EJB
    private HelperBeanF24 helperBeanF24;

    public String identify() {
        return "HelperBeanG24";
    }
}
