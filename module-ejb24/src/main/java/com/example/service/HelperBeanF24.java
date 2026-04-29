package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF24 {

    @EJB
    private HelperBeanE24 helperBeanE24;

    public String identify() {
        return "HelperBeanF24";
    }
}
